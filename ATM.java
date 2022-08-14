/*Pooja would like to withdraw X $US from an ATM. 
The cash machine will only accept the transaction if X is a multiple of 5, 
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction. */

import java.io.*;
class ATM {
    public static void main(String x[]) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float n1;
        float n2;
        String[] input = new String[2];
        input = in.readLine().split(" ");
        n1 = Float.parseFloat(input[0]);
        n2 = Float.parseFloat(input[1]);
        if(n1%5==0 && n2>=n1+0.5f){
                float leftCash = (float) ((n2-n1)-0.50);
                String left = String.format("%.2f", leftCash);
                System.out.println(left);
        }
        else{
            String notEnough = String.format("%.2f", n2);
            System.out.println(notEnough);
        }
    }
}

