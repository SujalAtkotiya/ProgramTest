import java.util.*;

public class Digit{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        String str = "";
        
        for(int i=1;i<=n;i++){
            str += i;
        }

        System.out.print(str.charAt(n-1));
    }
}