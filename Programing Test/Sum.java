import java.util.LinkedList;

public class Sum{
   

    public int number(LinkedList<Integer> l){
        int n= l.size();
        int num = 0;
        for(int i=0;i<n;i++){
            num += l.get(i)*Math.pow(10, i);
        }   
        return num;
    }

    public int sum(LinkedList<Integer> l,LinkedList<Integer> l1){
        Sum obj = new Sum();
        int a = obj.number(l) + obj.number(l1);
        return a;
    }

    public LinkedList<Integer> ans(int n){
        LinkedList<Integer> ls = new LinkedList<>();
        while (n != 0) {
            ls.add(n%10);
            n/=10;
        }
        return ls;
    }

    public static void main(String args[]){
        Sum obj1 = new Sum();

        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(2);
        ls.add(4);
        ls.add(3);

        LinkedList<Integer> ls1 = new LinkedList<>();
        ls1.add(5);
        ls1.add(6);
        ls1.add(4);

        LinkedList<Integer> ls2 = obj1.ans(obj1.sum(ls, ls1));

       for(int i=0;i<ls2.size();i++){
        System.out.print(ls2.get(i)+",");
       }
        //System.out.println(ls.get(0));
        
    }
}