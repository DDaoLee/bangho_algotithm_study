package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2480_DDaoLee_Q1 {
    // 주사위 세 개의 눈을 받아서 상금을 계산하는 함수
    public static int diceRole(int num1, int num2, int num3) {
        int result;

        // 모든 눈이 같은 경우: 10,000 + (같은 눈) * 1000
        if ((num1 == num2) && (num2 == num3)) {
            result = 10000 + num1 * 1000;
        }
        // 두 개의 눈만 같은 경우 (num1 == num2 또는 num1 == num3)
        else if (num1 == num2 || num1 == num3) {
            result = 1000 + num1 * 100;
        }
        // 두 개의 눈만 같은 경우 (num2 == num3)
        else if (num2 == num3) {
            result = 1000 + num2 * 100;
        }
        // 모두 다른 눈이 나오는 경우: 가장 큰 눈 * 100
        else {
            result = Math.max(num1, Math.max(num2, num3)) * 100;
        }

        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(diceRole(a,b,c));

    }

}
