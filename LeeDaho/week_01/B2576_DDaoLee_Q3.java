package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2576_DDaoLee {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int value = Integer.parseInt(br.readLine());

            if ( (value % 2) == 1){
                sum += value;
                minValue = Math.min(minValue, value);
            }
        }
        
        if (sum != 0){
            System.out.println(sum);
            System.out.println(minValue);
        } 
        else {
            System.out.println(-1);
        }
    }
}
