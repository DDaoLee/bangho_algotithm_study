package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class B1110_DDaoLee_Q3 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int origin = num;
        int count = 0;

        while(true){
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            count++;

            if (origin == num) break;
        }
        
        System.out.println(count);
    }
}
