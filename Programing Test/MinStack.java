import java.util.*;

public class MinStack{

    int[] stack = new int[100];
    int i=0,min;

    public void push(int a){
        if(i == 0){
            min = a;
        }

        if(a < min){
            min = a;
        }

        stack[i] = a;
        i++;
    }

    public void pop(){
        if(min == stack[i-1]){
            min = 0;
            for(int j=0;j<i-1;j++){
                if(stack[j] < min){
                    min = stack[j];
                }
            }
        }
        i--;
    }

    public int top(){
        int temp = i-1;
        return stack[temp];
    }

    public int getMin(){
        return min;
    }

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int n;
        MinStack minStack = new MinStack();
        String[] arr ={"MinStack","push","push","push","getMin","pop","top","getMin"};

        int[] input = {0,-2,0,-3,0,0,0,0};

        for(int j=0;j<arr.length;j++){
            if(arr[j] == "MinStack"){
                arr[j] = null;
            }
            else if(arr[j] =="push"){
                minStack.push(input[j]);
                arr[j] = null;
            }
            else if(arr[j] =="getMin"){
                arr[j] = minStack.getMin()+"";
            }
            else if(arr[j] =="top"){
                arr[j] = minStack.top()+"";
            }
            else if(arr[j] =="pop"){
                minStack.pop();
                arr[j] = null;
            }
        } 

        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}