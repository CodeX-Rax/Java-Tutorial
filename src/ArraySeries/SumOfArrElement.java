package ArraySeries;

public class SumOfArrElement {
    public static void main(String[] args ){
        int[] arr={2,3,4,6,5,3,54,7,85,43,7,8};
        int sum=0;
        for (int i=0;i< arr.length;i++) {//for(int i:arr)
            sum += arr[i];//sum=sum+arr[i]

        }
        System.out.println("Addition of element of array :"+sum);

    }
}
