public class Fibonacci {
    public static int Fibonacci(int n){
        if(n==0 )return 0;
        if(n==1)return 1;

        int fibn1 =Fibonacci(n-1);
        int fibn2 = Fibonacci(n-2);
        int fib = fibn1 + fibn2;
        return fib;

    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(Fibonacci(n));


    }
}
