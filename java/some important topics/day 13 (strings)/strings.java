import java.util.*;
public class strings {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
//strings are immutable 
    public static void main(String[] args) {

// defining the string
//         char arr[] ={ 'a','b','c','d'};
//         String str ="abcd";
//         String str2 = new String("xyz");


// // input of string
//         Scanner sc = new Scanner(System.in);
//         String name;
//         // name = sc.next();
//         name = sc.nextLine();
//         System.out.println(name);

// // finding length of string
//         String fullName ="Tony Stark";
//         System.out.println(fullName.length());



// concatenation
        String firstName ="Anushka";
        String lastName = "Agrahari";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName + " is this");



// finding a particular character from a string
        System.out.println(fullName.charAt(5));


        printLetters(fullName);



// compare function
       String s1 = "Anshika";
       String s2 = "Anshika";
       String s3 = new String("Anshika");


    //    it gives equal because here are checking only the values of string with the help of .equals function
       if(s1.equals(s3)){
        System.out.println("equal");
       }else{
        System.out.println("not equal");
       }



     //    it gives not equal because here are comparing on the objct level that's why both the values are different on the object level.
       if(s1 == s3){
        System.out.println("equal");
       }else{
        System.out.println("not equal");
       }




// substring
       String str = 
    }
}
