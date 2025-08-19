package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1919_DDaoLee_Q2 {

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 알파벳 'a'부터 'z'까지 각 알파벳의 등장 횟수를 기록할 배열
        int[] arr = new int[26];
        // 첫 번째 문자열 입력
        String str1 = br.readLine();
        // 두 번째 문자열 입력
        String str2 = br.readLine();

        // 첫 번째 문자열의 각 문자를 배열에 기록 (알파벳 등장 횟수 증가)
        for (int i = 0; i < str1.length(); i++) {
            // 'a'는 아스키 코드 97이고, 이를 빼서 알파벳의 인덱스를 구함 (0~25)
            arr[str1.charAt(i) - 97]++;
        }

        // 두 번째 문자열의 각 문자를 배열에 기록 (알파벳 등장 횟수 감소)
        for (int i = 0; i < str2.length(); i++) {
            // 두 번째 문자열에 있는 알파벳에 대해 첫 번째 문자열의 등장 횟수를 빼기
            arr[str2.charAt(i) - 97]--;
        }
        
        // 결과를 담을 변수 (두 문자열에서 문자를 일치시키기 위한 수정 횟수)
        int ans = 0;
        
        // 배열을 순회하며 각 알파벳에 대해 남은 차이의 절댓값을 더함
        for (int i = 0; i < arr.length; i++) {
            // 두 문자열의 차이만큼 수정해야 하므로, 각 문자의 차이(절댓값)를 더함
            ans += Math.abs(arr[i]);
        }
        
        // 결과 출력: 두 문자열을 동일하게 만들기 위한 최소 수정 횟수
        System.out.println(ans);
    }
    
}