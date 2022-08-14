/*Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of 
the TV remote increases the volume by 11 while pressing the volume down button decreases the volume by 11. 
Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so. */
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
