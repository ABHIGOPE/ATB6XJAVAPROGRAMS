package Practice.Aug;

public class Pattern4Alt {
    public static void main(String[] agrs){
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
