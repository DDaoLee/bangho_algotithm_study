package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2490_DDaoLee_Q2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 인덱스를 윷놀이 결과로 매핑
        // 0: D (윷), 1: C (걸), 2: B (개), 3: A (도), 4: E (모)
        String[] arr = {"D", "C", "B", "A", "E"};
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            // sum은 등(1)의 개수, 인덱스를 이용해 결과 문자 출력
            sb.append(arr[sum] + "\n");
        }
        System.out.print(sb);
    }
}
