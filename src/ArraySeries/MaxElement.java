package ArraySeries;

public class MaxElement {//find max value in an array
    public static void main (String args[]){
        int arr[]=new int[5];
        arr[0]=45;
        arr[1]=4567;
        arr[2]=245;
        arr[3]=1345;
        arr[4]=-415;
        int res = Integer.MIN_VALUE;//it is smallest value stored in res(i.e -ve infinity)

        for (int i=0;i<arr.length;i++){
            if (arr[i]>res){
                res=arr[i];
            }
        }
        System.out.println(res);


    }
}
