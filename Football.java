import java.util.*;
class Football{
    public static void main(String x[]){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            int[] InScore = new int[2];
            int[] FiScore = new int[2];
            for(int k=0;k<testcase;k++){
                for(int i=0;i<2;i++){
                    InScore[i]=sc.nextInt();
                }
                for(int j=0;j<2;j++){
                    FiScore[j]=sc.nextInt();
                }

                if(FiScore[0]<InScore[0] || FiScore[1]<InScore[1]){
                    System.out.println("IMPOSSIBLE");
                }
                else{
                    System.out.println("POSSIBLE");
                }
            }
        }
    }
}