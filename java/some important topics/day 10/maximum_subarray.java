// package day 10;


//brute force approach
public class maximum_subarray {
//     public static void maximum_sum(int numbers[]){
//         int maxSum = Integer.MIN_VALUE;
//         int currSum=0;

//         for(int i = 0;i<numbers.length;i++){
//             for(int j=i; j<numbers.length; j++){
//                 currSum=0;
//                 for(int k=i;k<=j;k++){
//                //subarray sum
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if (maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " +maxSum);
//     }

//     public static void main(String[] args) {
//         // int numbers[]={2,4,6,8,10};
//         int numbers[]={1,-2,6,-1,3};
//         maximum_sum(numbers);
//     }
    



// time complexity =O(n3)
 
    

 
// prefix sum array approach

    // public static void maximum_sum(int numbers[]){
    //     int maxSum = Integer.MIN_VALUE;
    //     int currSum=0;
    //     int prefix[]=new int[numbers.length];

    //     prefix[0]=numbers[0];
    //     // calculate prefix array
    //     for (int i=1 ;i<prefix.length;i++){
    //         prefix[i] = prefix[i-1]+numbers[i];
    //     }
        
    //     for(int i = 0;i<numbers.length;i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
    //             if (maxSum < currSum){
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " +maxSum);
    // }

    // public static void main(String[] args) {
    //     // int numbers[]={2,4,6,8,10};
    //     int numbers[]={1,-2,6,-1,3};
    //     maximum_sum(numbers);
    // }






// kadane's algorithm

 public static void kadanes(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum=0;
       
        for(int i=0;i<numbers.length;i++){
            currSum  = currSum +numbers[i];
            if(currSum < 0){
                currSum=0;
            }
            maxSum = Math.max (currSum,maxSum);
        }
        System.out.println("our max subarray sum is : " + maxSum);
    }
    public static void main(String[] args) {
        // int numbers[]={2,4,6,8,10};
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }

}