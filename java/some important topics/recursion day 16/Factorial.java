public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        // int F=factorial(n-1);
        // int f=n*F;
        int f = n*factorial(n-1);
        return f;

    }
public static void main(String args[]){
    // int n=5;
    System.out.println(factorial(5));
    // System.out.println(factorial(n));
    // System.out.println(f);
}
}
