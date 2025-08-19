package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475_DDaoLee_Q3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 방 번호 입력 받기 (정수 형태로 변환)
        int roomNumber = Integer.parseInt(br.readLine());
        // 각 숫자(0~9)의 개수를 세기 위한 배열
        int[] numArr = new int[10];

        // roomNumber의 각 자릿수를 하나씩 처리하며, 각 자릿수의 개수를 증가
        while (roomNumber != 0) {
            // 현재 자릿수의 숫자에 해당하는 인덱스를 찾아서 카운트 증가
            numArr[roomNumber % 10]++;
            // roomNumber에서 마지막 자리를 제거 (10으로 나누기)
            roomNumber /= 10;
        }

        // 6과 9는 같은 숫자판을 공유하기 때문에 합쳐서 처리
        // numArr[6]에 numArr[9]의 값을 합산하고, 2로 나누어 반올림 효과를 줌
        numArr[6] = ((numArr[6] + numArr[9]) + 1) / 2;
        
        // 가장 많이 필요한 숫자판의 개수를 찾기 위한 변수
        int ans = Integer.MIN_VALUE;
        
        // 배열에서 0부터 8까지의 숫자판의 개수를 비교
        for (int i = 0; i < numArr.length - 1; i++) {
            // max 값 갱신: 가장 큰 값을 찾음
            ans = Math.max(ans, numArr[i]);
        }

        // 최종적으로 필요한 숫자판의 개수 출력
        System.out.println(ans);
    }
}
