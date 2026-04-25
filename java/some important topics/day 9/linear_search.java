// package some important topics;
import java.util.*;

public class linear_search {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key = 10;

        int index=linearSearch(numbers,key);
        if(index==-1){
            System.out.println("not found");

        }
        else{
            System.out.println("key is at index : " +index);
        }
    }
}



// public static String linearSearch(int menu[] , int key){
//     for(int i = 0; i<menu.length;i++){
//         if(menu[i]==key){
//             return i; 
//         }
//     }
//     return -1;
// }
// public static void main(String[] args){
//     int string menu[]={"dosa","chole bhature","samosa","frooti","coke"};
//     int key = "samosa";

//     int index = linearSearch(menu,key);
//     if(index==-1){
//         System.out.println("not found");
//     }
//     else{
//         System.out.println("the key is at index : " + index);
//     }
// }





// time complexity = O(n)