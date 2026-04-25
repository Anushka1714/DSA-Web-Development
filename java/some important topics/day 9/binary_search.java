import java.util.*;
public class binary_search {
    public static int binarySearch(int numbers[],int key){
        // int start = numbers[0];
        // int end = numbers[n-1];
        int start = 0 ,  end = numbers.length-1; 
        while (start <=end){
       // finding mid
            int mid = (start +end )/2;
      //comparisons
            if(numbers[mid] ==key){
               return mid;
            }
            if ( numbers[mid] > key){  //left
                end = mid - 1;
            }
            else {                 //right
                start = mid + 1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        int key  = 10 ;
        System.out.println("index for key is : " + binarySearch(numbers,key));

    }
}
 


//  time complexity -> 