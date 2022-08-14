/*Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?*/

import java.util.*;
import java.io.*;


class CabService{
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
                if(a<b){
                    System.out.println("FIRST");
                }
                if(a==b){
                    System.out.println("ANY");
                }
                if(b<a){
                    System.out.println("SECOND");
                }
            }
        }


    }
}

