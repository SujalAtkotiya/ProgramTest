import java.util.*;

public class TrailingZeros{

    public int trailingZeros(int n){
        long fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        
        long temp = fact%10;
        fact = fact/10;
        if(temp != 0 ){
            return 0;
        }else{
            int i=0;
            while(temp == 0){
                i++;
                temp = fact%10;
                fact = fact/10;
            }
            return i;
        }
        
    }

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        TrailingZeros obj = new TrailingZeros();
        System.out.print(obj.trailingZeros(n));

    }
}