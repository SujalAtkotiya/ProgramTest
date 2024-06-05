public class HayStack{

    public int occurrence(String haystack,String needle){

        int j=0,i;
        for(i=0;i<haystack.length();i++){
            if(j >= needle.length()){
                return (i - (j-1)-1);
            }
            else if((haystack.charAt(i) == needle.charAt(j)) && j < needle.length()){
                j++;
            }
            else{
                j = 0;
            }
        }
        if(j >= needle.length()){
            return (i - (j-1)-1);
        }
        return -1;
    }

    public static void main(String args[]){
        String haystack = "kevin";
        String needle = "ke";
        HayStack obj = new HayStack();
        System.out.print(obj.occurrence(haystack,needle));
    }
}
