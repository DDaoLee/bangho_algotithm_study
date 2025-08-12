package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1292_DDaoLee_Q2 {

    // 주어진 인덱스까지 수열의 합을 계산하는 함수
    public static int getSum(int index){
        int totalSum = 0;         // 현재까지 누적된 합
        int currentIdx = 0;       // 수열의 총 길이 (몇 개의 숫자가 들어갔는지)
        int currentNumber = 0;    // 현재 숫자

        while(true){
            currentIdx += ++currentNumber;               // 현재 숫자만큼 수열 길이 누적
            totalSum += currentNumber * currentNumber;   // 해당 숫자의 누적 합도 추가 (숫자 ㅌ 반복 횟수)

            // 만약 현재까지 수열 길이가 index를 초과했다면 초과된 부분 조정
            if (currentIdx > index){
                totalSum -= currentNumber * (currentIdx - index);  // 초과된 만큼 현재 숫자의 합에서 빼줌
                break;
            }
        }

        return totalSum;  // index번째까지 수열의 합 반환
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 

        int startIdx = Integer.parseInt(st.nextToken());  // 구간 시작 인덱스
        int endIdx = Integer.parseInt(st.nextToken());    // 구간 끝 인덱스

        // [startIdx, endIdx] 범위의 합 = getSum(endIdx) - getSum(startIdx - 1)
        System.out.println(getSum(endIdx) - getSum(startIdx - 1));
    }
}