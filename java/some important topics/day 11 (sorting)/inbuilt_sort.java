import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort {


    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }


      public static void printArr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //  int arr[]={5,4,1,3,2};
        //  Arrays.sort(arr);
        //  Arrays.sort(arr , 0 ,3);


       
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr,Collections.reverseOrder());
         Arrays.sort(arr,2,5,Collections.reverseOrder());
         printArr(arr);
    }
}
 