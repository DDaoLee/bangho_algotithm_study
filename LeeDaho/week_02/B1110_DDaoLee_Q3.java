package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1110_DDaoLee_Q3 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        
        // 원래 입력값을 기억하기 위해 변수에 저장
        int origin = num;
         
        // 반복 횟수를 세기 위한 카운터
        int count = 0;

        // 주어진 숫자가 원래 숫자와 같아질 때까지 반복
        while(true){
            // num의 십의 자릿수와 일의 자릿수를 더한 값을 새로운 num으로 설정
            // (num % 10) => 일의 자릿수
            // (num / 10) => 십의 자릿수
            // (num / 10) + (num % 10) => 십의 자릿수와 일의 자릿수의 합
            // 그 합을 10으로 나눈 나머지를 일의 자릿수로 사용
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            
            // 한 번 반복할 때마다 카운트 증가
            count++;

            // 계산된 num이 원래 입력값과 같다면 반복 종료
            if (origin == num) break;
        }
        
        // 몇 번의 반복이 일어났는지 출력
        System.out.println(count);
    }
}