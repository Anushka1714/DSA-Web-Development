public class SumNaturalNumber {
    public static int Natural(int n){
        if(n==1){
            return 1;
        }
        int sum = Natural(n-1);
        int sum1 = n+sum;
        return sum1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Natural(n));
    }
}
