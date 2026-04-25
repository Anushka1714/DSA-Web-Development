import java.util.*;
public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        // int count = 0;
        // while(count <= 5){
        //     System.out.println("Hello world");  
        //     count++;
        // }
        // System.out.println("printed hello world 100 times");




// print numbers from 1 to 10.
        // int counter = 1;
        // while (counter <= 10){
        //     System.out.println(counter);
        //     counter++;
        // }


// print numbers from 1 to n.
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter <= n){
        //     System.out.print(counter);
        //     counter++;
        // }


// sum of first n natural numbers.
        // int n = sc. nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i <= n){
        //     sum = sum + i;
        //     i++;
        //     //   System.out.println(sum);
        // }
        //  System.out.println(sum);




// for loop
        // for(int i = 1 ; i < 10 ; i++){
        //     System.out.println("hello world");
        // }



// printing square pattern 
            // for (int i = 1; i <= 4;i++){
            //         System.out.println ("* * * *");
            //     }
            


// print reverse of a number
            //   int n = sc.nextInt();
            // //   int last_digit = 0;
            //   while (n > 0){
            //   int last_digit = n%10;
            //   System.out.print(last_digit +" ");
            //   n = n / 10;;
            //   }
            //   System.out.println();



// reverse the given number
            //  int n = sc.nextInt();
            //  int rev =  0;
            //  while (n > 0){
            //     int last_digit = n % 10;
            //     rev = (rev * 10) + last_digit;
            //     n = n / 10;
            
            //  }
            //      System.out.println (rev);




// do while loop
            //   int i = 1;
            //   do{
            //     System.out.println("hello world");
            //     i++;
            //   }
            //   while( i <= 5);




// break statement
    //         for (int i = 1; i<=5;i++){
    //             if (i==3){
    //                 break;
    //             }
    //             System.out.println(i);
    //         }
    //         System.out.println("i am out of the loop");




// keep entering numbers till users enters a multiple of 10
                // do {
                //     System.out.println ("enter your number : ");
                //     int n = sc.nextInt();
                //     if ( n% 10 == 0){
                //         break;
                //     }
                //     System.out.println(n);

                // }
                // while (true);




// comtinue statement
    //       for ( int i = 1; i<= 5 ; i++){
    //         if (i==3){
    //             continue;
    //         }
    //         System.out.println(i);
    //       }
    // }



// display all numbers entered by user except mumtiples of 10
                // do {
                //     System.out.println ("enter your number : ");
                //     int n = sc.nextInt();
                //     if ( n% 10 == 0){
                //         continue;
                //     }
                //     System.out.println(n);

                // }
                // while (true);
 





// check if a number is prime or not

        //    int n = sc.nextInt();
        //    if(n ==2){
        //         System.out.println("n is prime");
        //    }
        //    else{
        //    boolean isPrime=true;
        //    for(int i=2; i<=n-1;i++){
        //         if(n%i==0){             //n is the multiple of i (i not equal to 1 or own)
        //                 isPrime = false;

        //         }
        //    }
        //    if (isPrime == true){
        //         System.out.println("n is prime");
        //    }
        //    else{
        //         System.out.println("n is not prime");
        //    }
          
        // }




    int n = sc.nextInt();
           if(n ==2){
                System.out.println("n is prime");
           }
           else{
           boolean isPrime=true;
           for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){             //n is the multiple of i (i not equal to 1 or own)
                        isPrime = false;

                }
           }
           if (isPrime == true){
                System.out.println("n is prime");
           }
           else{
                System.out.println("n is not prime");
           }
          
        }

}
}
