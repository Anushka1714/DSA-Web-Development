import java.util.*;
public class conditional {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        // int age = sc.nextInt();
        // if (age >= 18){
        //     System.out.println("adult , eligible to vote");
        // }
        // else{
        //     System.out.println("not eligible to vote");
        // }



// printing the largest of 2 numbers
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // if (A > B){
        //     System.out.println("A is largest number");
        // }
        // else if (B > A){
        //     System.out.println("B is largest number");
        // }
        // else{
        //     System.out.println("both A and B are equal");
        // }



// print if number is odd or even
        // int number = sc.nextInt();
        // if ( number % 2 == 0){
        //     System.out.println("number is even");
        // }
        // else{
        //     System.out.println("number is odd");
        // }
    




// income tax calculator
        //   int income = sc.nextInt();
        //   int tax;
        //   if(income < 500000){
        //     // System.out.println("0% tax");
        //     tax = 0;
        //   } 
        //   else if(income >500000 && income < 10000000){
        //     // System.out.println("20% tax");
        //     tax = (int)(income * 0.2);
        //   }
        //   else{
        //     // System.out.println("30% tax");
        //     tax = (int)(income * 0.3);
        //   }
        //   System.out.println("your tax is : " + (tax));


 // print the largest of 3 numbers
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // int num3 = sc.nextInt();
    // if (num1 > num2 && num1 > num3){
    //     System.out.println("num1 is greater");
    // }
    // else if (num2 > num1 && num2 > num3){
    //     System.out.println("num2 is greater");
    // }
    // else if (num3 > num1 && num3 > num2){
    //     System.out.println("num3 is greater");
    // }
    // else{
    //     System.out.println("all are equal");
    // }





    
// ternary operator
        //     int number = 4;
        //    String type = (number % 2 == 0) ? "even" : "odd"; 
        //    System.out.println(type);



// check if a student will pass or fail
    //    float marks = sc.nextFloat();
    //    if (marks >=33.0){
    //     System.out.println("pass");
    //    }
    //    else{
    //     System.out.println("fail");
    //    }

// using ternary operator
    // int marks = 67;
    // String reportCard = marks >= 33 ? "pass" : "fail";
    // System.out.println(reportCard);





// switch statement  
            // int number = 2;  
            // switch(number){
            //     case 1 : System.out.println("samosa");
            //              break;
            //     case 2 : System.out.println("burger");
            //              break;
            //     case 3 : System.out.println("mango shake");
            //              break; 
            //     default : System.out.println("we wake up"); 

            // }

           System.out.println("enter a : ");
            int a = sc. nextInt();
            System.out.println("enter b : ");
            int b = sc.nextInt();
            System.out.println("enter operator : ");
            char operator = sc.next().charAt(0);

            switch(operator){
                case '+' : System.out.println(a+b);
                           break;
                case '-' : System.out.println(a-b);
                           break;
                 case '*' : System.out.println(a*b);
                           break;
                case '/' : System.out.println(a/b);
                           break;
                 case '%' : System.out.println(a%b);
                           break;
                default :  System.out.println ("wrong operator");

            }

    
    }
}
 