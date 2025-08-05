package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562_DDaoLee {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > maxValue){
                maxValue = value;
                maxIndex = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
