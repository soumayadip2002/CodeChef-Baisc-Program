import java.util.*;
class CourseRegistration {
    public static void main(String x[]) throws java.lang.Exception{
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();
            int[] arr = new int[3];
            while(testcase>0){
                for(int i=0;i<3;i++){
                    arr[i]=sc.nextInt();
                }

                if(arr[0]+arr[2]<=arr[1]){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}
