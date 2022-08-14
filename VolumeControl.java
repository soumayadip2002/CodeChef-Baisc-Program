import java.util.*;
import java.io.*;
class VolumeControl {
    public static void main(String x[]) throws IOException{
        try (Scanner sc = new Scanner(System.in)) {
            int testcase = sc.nextInt();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            for(int i=0;i<testcase;i++){
                String[] input = new String[2];
                int a;
                int b;
                input = in.readLine().split(" ");
                a = Integer.parseInt(input[0]);
                b = Integer.parseInt(input[1]);

                System.out.println(Math.abs(a-b));
            }
        } 
    }
}
