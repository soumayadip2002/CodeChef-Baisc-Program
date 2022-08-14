/*Chef has finally got the chance of his lifetime to drive in the F1F1 tournament. But, there is one problem. 
Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.
Given the fastest finish time as XX seconds and Chef's finish time as YY seconds, 
determine whether Chef will be allowed to race in the main event or not.
Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time. */
import java.util.*;
class Race {
    public static void main(String[] x){
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            int[] arr = new int[2];
            for(int k=0;k<testcase;k++){
                for(int i=0;i<2;i++){
                    arr[i]=sc.nextInt();
                }
                if(arr[1]<=arr[0]*1.07){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
