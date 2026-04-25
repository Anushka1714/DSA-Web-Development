public class OddOrEven{
    public static void Odd_Even(int n){
        int BitMask = 1;
        if ((n & BitMask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        Odd_Even(3);
        Odd_Even(14);
    }
}