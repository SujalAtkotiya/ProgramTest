import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distance {

    public String toBinary(int n){
        List<Integer> ls = new ArrayList<>();

        while(n > 0){
            int temp = n % 2;
            n /= 2;
            ls.add(temp); 
        }
        String s = "";
        for(int i=ls.size()-1;i>=0;i--){
            s += ls.get(i);
        }

        return s;
    }

    public int distance(int a, int b){
        Distance obj = new Distance();

        String s = obj.toBinary(a);
        String s2 = obj.toBinary(b);    

        int l1 = s.length()-1,l2 = s2.length()-1;
        int ans = Math.abs(l1-l2);
        
       

        while(l1 >= 0 && l2 >= 0){
            if(s.charAt(l1) != s2.charAt(l2)){
                ans++;
            }
            l1--;
            l2--;
        }

        return ans;
    }

    public static void main(String[] args) {

        Distance obj = new Distance();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a : ");
        int a = sc.nextInt();
        System.out.print("Enter Number b : ");
        int b = sc.nextInt();

        System.out.println(obj.distance(a,b));
    }
}
