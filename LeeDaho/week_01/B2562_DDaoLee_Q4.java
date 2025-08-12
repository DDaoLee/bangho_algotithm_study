package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562_DDaoLee_Q4 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            int value = Integer.parseInt(br.readLine());

            // 현재 입력값이 maxValue보다 크다면, 최댓값과 인덱스 갱신
            if (value > maxValue) {
                maxValue = value;     // 최댓값 저장
                maxIndex = i + 1;     // 인덱스는 1부터 시작하므로 i + 1
            }
        }

        System.out.println(maxValue);
        System.out.println(maxIndex);
    }
}
