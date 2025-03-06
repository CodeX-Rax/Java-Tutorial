package ArraySeries;

public class ArrElementSearch
{
    public static void main (String args[]){
        int arr[]={23,5,5,7,876,54,23,4,5,6};
        for (int i : arr){
            if (i==876){
                System.out.println("Element Found");
            }else {
                System.out.println("Element Not Found");
            }
        }
    }
}
