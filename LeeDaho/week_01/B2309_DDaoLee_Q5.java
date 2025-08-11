package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309_DDaoLee_Q5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int heightSum = 0;
        int[] height = new int[9];

        // 아홉 난쟁이 키 입력 받기
        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            heightSum += height[i]; // 총합 계산
        }

        // 키 배열 오름차순 정렬 (출력 요구 사항에 따라)
        Arrays.sort(height);

        int fake1 = -1; // 가짜 난쟁이 1
        int fake2 = -1; // 가짜 난쟁이 2
        boolean isfound = false; // 가짜 난쟁이 2명을 찾았는지 여부

        // 두 명의 난쟁이를 골라 합이 (전체 합 - 100)인지 확인
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                // 나머지 7명의 합이 정확히 100이 되는 경우
                if (height[i] + height[j] == heightSum - 100) {
                    fake1 = height[i]; // 첫 번째 가짜 난쟁이 키
                    fake2 = height[j]; // 두 번째 가짜 난쟁이 키

                    // 가짜 난쟁이 둘을 제외한 7명의 키 출력
                    for (int k = 0; k < height.length; k++) {
                        if (height[k] != fake1 && height[k] != fake2) {
                            System.out.println(height[k]);
                        }
                    }

                    isfound = true; // 찾았음을 표시하고
                    break; // 내부 반복문 종료
                }
            }
            if (isfound) break; // 외부 반복문도 종료
        }
    }
}
