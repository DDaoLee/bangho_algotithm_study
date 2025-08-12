package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1292_DDaoLee_Q2 {
    public static int getSum(int index){
        int totalSum = 0;
        int currentIdx = 0;
        int currentNum = 0;

        while(true){
            currentIdx += ++currentNum;
            totalSum += currentNum * currentNum;

            if (currentIdx > index){
                totalSum -= currentNum * (currentIdx - index);
                break;
            }
        }

        return totalSum;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startIdx = Integer.parseInt(st.nextToken());
        int endIdx = Integer.parseInt(st.nextToken());

        System.out.println(getSum(endIdx) - getSum(startIdx - 1));
    }
}
