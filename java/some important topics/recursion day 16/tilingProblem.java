public class tilingProblem{
    public static int tilingProblem(int n){
        if(n==0 ||n==1){
            return 1;
        }
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);

        int totWork = fnm1 + fnm2;
        return totWork;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}