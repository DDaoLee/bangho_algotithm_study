package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808_DDaoLee_Q0 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 26개의 알파벳 각각의 개수를 저장할 배열
        int[] alphabet = new int[26];
        // 입력받은 문자열을 'input'에 저장
        String input = br.readLine();

        // 문자열의 각 문자에 대해 반복하며 해당 알파벳의 개수 증가
        for (int i = 0; i < input.length(); i++) {
            // 'a'의 아스키 코드 값(97)을 빼서 알파벳의 인덱스를 구하고, 그 자리에 해당하는 개수 증가
            alphabet[input.charAt(i) - 97]++;
        }

        // 결과를 출력할 StringBuilder 객체 생성
        StringBuilder ans = new StringBuilder();
        // alphabet 배열의 각 알파벳 개수를 출력할 형식으로 append
        for (int i = 0; i < alphabet.length; i++) {
            // 각 알파벳 개수를 공백으로 구분하여 append
            ans.append(alphabet[i]).append(" ");
        }

        // 최종 결과 출력
        System.out.println(ans);
    }
}