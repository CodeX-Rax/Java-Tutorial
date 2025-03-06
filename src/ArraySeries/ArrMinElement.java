package ArraySeries;

public class ArrMinElement {
    public static void main (String args[]){
        int arr[]=new int[5];
        arr[0]=45;
        arr[1]=4567;
        arr[2]=-2245;
        arr[3]=1345;
        arr[4]=-415;
        int res = Integer.MAX_VALUE;//it is Largest value stored in res (i.e +ve infinity)

        for (int i=0;i<arr.length;i++){
            if (arr[i]<res){
                res=arr[i];
            }
        }
        System.out.println(res);


    }
}
