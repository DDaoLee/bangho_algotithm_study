package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869_DDaoLee_Q4 {
    public static void main(String[] args) throws IOException {
        
        // BufferedReader를 사용하여 사용자 입력을 받기 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // StringTokenizer를 사용하여 입력값을 공백 기준으로 나누어 처리
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // A, B, V 값을 각각 읽어 정수로 변환 
        int A = Integer.parseInt(st.nextToken()); // 낮 동안 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤 동안 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 목표로 가야 할 높이
        
        // (V - B) / (A - B) 는 목표 높이에 도달하기 위한 실제 올라야 할 거리 / 하루 동안 올라가는 순수 높이
        // Math.ceil()을 사용하여 올림하여, 전체 일수를 계산
        System.out.println((int)Math.ceil((double)(V - B) / (A - B))); 
    }
}