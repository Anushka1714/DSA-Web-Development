import java.util.*;   //here we have imported a package
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);  //created an input
        // String input = sc.next();    //by this we assign an input to string input
        // System.out.println(input); 

        // String name = sc.nextLine();
        // System.out.println(name);


        // int number = sc.nextInt();
        // System.out.println(number);

        //  float price = sc.nextFloat();
        // System.out.println(price);


        // boolean b = sc.nextBoolean();
        // System.out.println(b);


        // short s = sc.nextShort();
        // System.out.println(s);


        // long l = sc.nextLong();
        // System.out.println(l);





// sum of a and b
    //    int a=sc.nextInt();
    //    int b=sc.nextInt();
    //    int sum=a+b;
    //    System.out.println(sum);



// product of a and b
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int product=a*b;
        // System.out.println(product);



// area of circle
        // int rad=sc.nextInt();
        // // double area=3.14 * rad * rad;         //in java 3.14 is treated as double
        // float area=3.14f* rad* rad;             //if we want to define any value to float it is mandatory to write f after giving the value like 3.14f
        // System.out.println(area);


// typeconversion
    //     int a=25;
    //     float b=a;
    //     System.out.println(b);


        //  double a=25.0;
        //  int b=a;
        //  System.out.println(b);          //it will not typecaste the value because of larger to smaller datatype.

         
        // int number = sc.nextFloat();     //here in this we can't assign the float value to the integer
        // System.out.println(number);

        // while we can assign int value to float
        // float number = sc.nextInt();
        // System.out.println(number);



// typecasting(loss of data)
    //      float a=25.999f;
    //      int b =(int)a;
    //      System.out.println(b);

    //    // in java we can easily typecast char to integer
    //      char ch='a';
    //      char ch2='b';
    //      int number = ch;
    //      int number2 = ch2;
    //      System.out.println(number);
    //      System.out.println(number2);



// type promotion
        //   char a = 'a';
        //   char b = 'b';
        //   System.out.println(b+a);


        //   short a = 5;
        //   byte b =25;
        //   char c ='c';
        //   System.out.println(a+b+c);



        //   int a = 10;
        //   float b = 20.25f;
        //   long c = 25;
        //   double d = 30;
        //   double ans = a+b+c+d;
        //   System.out.println(ans);
      
          
// this is wrong statement it will raise an error  here we are using an expression as b*2 so it will autpmmatically use type promotion so it will treat as int and then it will convert int to byte means loass of data.
        // byte b = 5;
        // b = b*2;
        // System.out.println(b);

// thhis is correct statement
        byte b= 5;
         b= (byte)(b*2);
         System.out.println(b);
    } 
    
}
