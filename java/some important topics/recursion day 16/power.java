public class power {
    // public static int power(int x,int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     int xn1 = power(x, n-1);
    //     int xn = x * xn1;
    //     return xn;
    // }

    // public static void main(String[] args) {
    //     System.out.println(power(2,10));
    // }
    


// optimized

public static int optimizedPower(int x , int n){
    if(n == 0){
        return 1;
    }

    // int halfPower = optimizedPower(x, n/2) * optimizedPower(x, n/2);
    int halfPower = optimizedPower(x, n/2);
    int halfPowerSq = halfPower * halfPower;


    //n is odd
    if(n % 2 !=0){
        halfPowerSq = x * halfPowerSq;
    }

return halfPowerSq;

}
public static void main(String[] args) {
    System.out.println(optimizedPower(2,50));
}
}




