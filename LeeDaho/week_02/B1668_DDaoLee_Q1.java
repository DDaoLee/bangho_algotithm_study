package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1668_DDaoLee_Q1 {

    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위해 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 트로피 개수 입력
        int n = Integer.parseInt(br.readLine());
        int[] trophy = new int[n];  // 트로피의 높이를 저장할 배열

        // 트로피 높이 입력 받기
        for (int i = 0; i < trophy.length; i++) {
            trophy[i] = Integer.parseInt(br.readLine());
        }

        // 왼쪽에서 봤을 때 보이는 트로피 개수
        int left = 1;  // 처음 트로피는 항상 보임
        int highest = trophy[0];  // 현재까지 가장 높은 트로피

        // 왼쪽 → 오른쪽으로 탐색(N = 1일때도 통과)
        for (int i = 0; i < trophy.length - 1; i++) {
            // 다음 트로피가 현재 최고보다 높다면 보임
            if (trophy[i + 1] > highest) {
                left++;  // 보이는 트로피 수 증가
                highest = trophy[i + 1];  // 최고 높이 갱신
            }
        }

        // 오른쪽에서 봤을 때 보이는 트로피 개수
        int right = 1;  // 마지막 트로피는 항상 보임
        highest = trophy[n - 1];  // 오른쪽 끝에서 시작

        // 오른쪽 → 왼쪽으로 탐색
        for (int i = trophy.length; i >= 1; i--) {
            // 현재 인덱스는 i-1 (배열 인덱스는 0부터 시작하므로)
            if (trophy[i - 1] > highest) {
                right++;  // 보이는 트로피 수 증가
                highest = trophy[i - 1];  // 최고 높이 갱신
            }
        }

        // 결과 출력
        System.out.println(left);
        System.out.println(right);        
    }
}
