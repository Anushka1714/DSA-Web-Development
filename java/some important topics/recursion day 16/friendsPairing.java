public class friendsPairing {
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }

        //single
        int fnm1=friendPair(n-1);

        //pair
        int fnm2 = friendPair(n-2);

        int pairWays = (n-1) * fnm2;
        
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendPair(n));
    }
    
}
b  