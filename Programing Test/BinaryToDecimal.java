public class BinaryToDecimal {

    public double number(String[] arr){
        double ans = 0;
        int n = arr[0].length()-1,j=0;
        while(n>=0){
            
            if(arr[0].charAt(n) == '1'){
                ans += Math.pow(2, j);
            }
            j++;
            n--;
        }
        n = -1;
        j=0;
        while(j < arr[1].length()){
            if(arr[1].charAt(j) == '1'){
                ans += Math.pow(2, n);
            }
            n--;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {

        BinaryToDecimal obj =  new BinaryToDecimal();

        String str = "1010.1110";
        String[] arr = new String[2];
        arr[0]="";
        arr[1]="";
        int j=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '.'){
                j++;
            }else{
                arr[j] = arr[j]+str.charAt(i);
            }
        }

        System.out.println(obj.number(arr));

    }   
}
