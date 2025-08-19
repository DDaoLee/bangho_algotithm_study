package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577_DDaoLee_Q1 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 0~9의 개수를 저장할 배열 (각 숫자 등장 횟수를 카운트)
        int[] numArr = new int[10];

        // 3개의 입력값을 각각 받기
        int a = Integer.parseInt(br.readLine());  // 첫 번째 숫자
        int b = Integer.parseInt(br.readLine());  // 두 번째 숫자
        int c = Integer.parseInt(br.readLine());  // 세 번째 숫자

        // 세 숫자를 곱한 값을 저장
        int mulData = a * b * c;

        // 곱한 값에서 각 자릿수를 하나씩 분리하여 그 자릿수의 등장 횟수를 카운트
        while(mulData != 0){
            // mulData의 마지막 자릿수를 구해서 그 자릿수의 카운트 증가
            numArr[mulData % 10]++;
            // mulData를 10으로 나누어 다음 자릿수를 구함
            mulData /= 10;
        }

        // 각 숫자의 등장 횟수를 출력
        for (int i = 0; i < numArr.length; i++) {
            // numArr[i]는 숫자 i의 등장 횟수이므로 그것을 출력
            System.out.println(numArr[i]);
        }

    }
}