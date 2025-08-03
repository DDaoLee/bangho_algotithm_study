package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480_DDaoLee {
    public static int diceRole(int num1, int num2, int num3){
        int result; 

        if ((num1 == num2) && (num2 == num3)){
            result = 10000 + num1 * 1000;
        }
        else if (num1 == num2 || num1 == num3) {
            result= 1000 + num1 * 100;
        }
        else if (num2 == num3) {
            result= 1000 + num2 * 100;
        }
        else {
            result = Math.max(num1, Math.max(num2, num3)) * 100;
        }


        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(diceRole(a,b,c));

    }

}
