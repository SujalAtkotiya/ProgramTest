public class Minimum {

    public int minimum(int[] arr){
        return arr[arr.length - (arr[0]-1)];
    }

    public static void main(String[] args) {
        Minimum obj = new Minimum();
        int[] arr = {8,9,10,1,2,3,4,5,6,7};
        System.out.println(obj.minimum(arr));
    }
}


