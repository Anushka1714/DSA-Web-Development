import java.util.*;
public class function {
    
    // public static void printHelloWorld(){   //function creation
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     return;
    // }

    //  public static int printHelloWorld(){   //function creation
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     System.out.println("hello world");
    //     return 2;  //mandatory to write return  because it is void type function it is of integer type
    // }
// public static void calculateSum( int a , int b){

//      int sum = a+b;
//      System.out.println("sum is " + sum);

// }

//     public static void main(String args[]){
//     //     printHelloWorld();        //function call
//      Scanner sc = new Scanner (System.in);
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      calculateSum(a,b);



//      public static int calculateSum( int num1 , int num2){    //parameters or formal parameters

//      int sum = num1 + num2;
//      return sum;
     

// }



// public static void swap(int a,int b){
//      // swap
//     int temp = a;
//     a = b;
//     b= temp;
//     System.out.println("a= " + a);
//     System.out.println("b=" + b);
    
// sum of two numbers
 
// }
//     public static void main(String args[]){
//     //     printHelloWorld();        //function call
//     //  Scanner sc = new Scanner (System.in);
//     //  int a = sc.nextInt();
//     //  int b = sc.nextInt();
//     //  int sum = calculateSum(a,b);  //arguments or actual parameters
//     //  System.out.println("sum is " + sum);




//     // swap - values exchange
//     int a = 5;
//     int b = 10;
//     swap(a,b);

   
//   product of two numbers

// public static int product (int a, int b){
//     int multiply = a * b;
//     return multiply;

// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int prod = product(a,b);
//     System.out.println("product is: "+ prod);
// }
    

// factorial

// public static int factorial(int n){
//     int f = 1;
//     for(int i=1; i<=n ;i++){
//         f = f * i;

//     }
//     return f;
// }
// // public static void main(String[] args) {
// //     System.out.println(factorial(4));
// //     System.out.println(factorial(7));
// // }



// // binomial coefficient

// public static int BinCoeff(int n,int r){
//     int n_fact = factorial(n);
//     int r_fact = factorial(r);
//     int nmr_fact = factorial(n-r);

//     int BinCoeff = n_fact / (r_fact * nmr_fact);
//     return BinCoeff;

// }
// public static void main(String args[]){
//     System.out.println(BinCoeff(5, 2));
// }



// function overloading
        // using parameters
        //   public static int Sum(int a , int b){
        //     return a + b;
        //   }
        //   public static int Sum (int a , int b ,int c){
        //     return a + b + c ;
        //   }
        //   public static void main(String args[]){
        //     System.out.println(Sum(3,5));
        //     System.out.println(Sum(2,3,4));

        //   }

        //   using datatypes
        //    public static int Sum(int a , int b){
        //     return a + b;
        //    }
        //    public static float Sum(float a , float b){
        //     return a + b;
        //    }
        //    public static void main(String[] args) {
        //     System.out.println(Sum(4,5));
        //     System.out.println(Sum(4.0f,5.0f));
        //    }



// check if a number is prime or not


// only for n>=2
//              public static boolean isPrime(int n){
// // corner cases 
// // 2
//     if (n==2){
//         return true;
//     }

                
//                 // boolean isPrime = true;
//                 for(int i=2; i<=n-1;i++ ){
//                     if(n % i == 0){
//                         // isPrime = false;
//                         // break;
//                         // return isPrime;
//                         return false;
//                     }
//                 }
            
             
//             //  return isPrime;
//              return true;
//              }
                    
//     public static void main(String args[]){
//         System.out.println(isPrime(7));
//     }



// optimized solution
    // public static boolean isPrime(int n){
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i=1;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    
    // public static void main(String[] args) {
    //     System.out.println(isPrime(6));
    // }




// print all primes in a range
// public static void primesinRange(int n){
//     for(int i=2;i<=n;i++){
//         boolean isPrime;
//         if(isPrime(i)){
//             System.out.println(i+" ");
//         }
//     }
//     System.out.println();
// }

//     public static void main(String args[]){
//           primesinRange(20);

//     }



// convert from binary to decimal
// public static void BintoDec(int binNum){
//     int myNum = binNum;
//     int pow = 0;
//     int decNum = 0;

//     while(binNum > 0){
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
//         pow++;
//         binNum = binNum /10;
//     }
//     System.out.println("decimal of " + myNum +" = " + decNum);


// }
// public static void main(String[] args) {
//     BintoDec(1000);
    
// }


// convert decimal to binary
// public static void DectoBin(int decNum){
//     int pow = 0;
//     int binNum = 0;
//     int myNum = decNum;

//     while(decNum > 0){
//         int rem = decNum % 2;
//         binNum = binNum + (rem *(int)Math.pow(10,pow));
//         pow++;
//         decNum = decNum / 2; 
//     }
//     System.out.println("binary of " + myNum + " = " + binNum);
// }
// public static void main(String[] args) {
//     DectoBin(6);
//     DectoBin(9);
// }



// practice questions


// public static int average(int a,int b,int c){
    // int avg=(a+b+c)/3;
    // return avg;
// }


// public static boolean isEven(int n){
//     if(n%2==0){
//         return true;
//     }
//     else{
//         return false;
//     }
// }


// public static void palindrome(int n){
//     int temp=n;
//     int rev = 0;
//     while(n!=0){
//     int rem = n%10;
//     rev=(rev * 10) + rem;
//      n=(n/10);
// }
// if(rev==temp){
//     System.out.println("palindrome");
// }
// else{
//     System.out.println("not palindrome");
// }
// }




public static int sumOfDigits(int n){
    int sum=0;
    while(n!=0){
    int lastDigit = n%10;
    sum= sum+lastDigit;
    n= n/10;  
    }
return sum;
}

public static void main(String[] args) {
//    System.out.println( average(5,6,7));

    //   boolean ans = isEven(6);
    //   System.out.println("the ans is : " + ans);

// palindrome(1231);
// System.out.println(sumOfDigits(1234));


Scanner sc = new Scanner (System.in);
System.out.println("please enter the value of n :");
int n=sc.nextInt();
int ans=sumOfDigits(n);
System.out.println("Sum of digits of "+n+" is "+ans);
}

} 








    

