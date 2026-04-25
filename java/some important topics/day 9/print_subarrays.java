public class print_subarrays {
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        
        for(int i=0;i<numbers.length;i++){
            // int start = i;
            for(int j=i;j<numbers.length;j++){
                // int end= j;
                int sum = 0;
                for(int k=i ; k<=j;k++ ){
                    System.out.print(numbers[k]+" "); //subarrays
                    sum = sum +numbers[k];  
                }
                System.out.println();
                System.out.println("Current Subarray sum "+sum);
                //     System.out.println();
                 ts=ts+sum;
            }
        }
        System.out.println("total subarrays : " +ts);
        
    }
    

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
        
    }
}
