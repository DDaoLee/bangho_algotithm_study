package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2576_DDaoLee_Q3 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            int value = Integer.parseInt(br.readLine());

            if ((value % 2) == 1) { // 홀수인 경우
                sum += value; // 합에 더하고
                minValue = Math.min(minValue, value); // 현재 최솟값과 비교
            }
        }

        // 홀수가 하나 이상 있는 경우
        if (sum != 0) {
            System.out.println(sum); // 홀수의 합 출력
            System.out.println(minValue); // 최솟값 출력
        } else { 
            // 홀수가 하나도 없는 경우
            System.out.println(-1); // -1 출력
        }
    }
}
