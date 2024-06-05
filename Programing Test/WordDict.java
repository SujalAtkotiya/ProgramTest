import java.util.HashSet;

public class WordDict {
    public static void main(String[] args) {
        String s = "mayurpadiya";
        String[] wordDict = {"may","iya","urd"};

        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i));

            for(int j=0;j<wordDict.length;j++){
                if(sb.toString().equals(wordDict[j])){
                    set.add(sb.toString());
                    sb.delete(0, sb.toString().length());
                }
            }
        }

        if(set.size() <= wordDict.length && set.size()>0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
