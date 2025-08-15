package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20546_DDaoLee_Special {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 초기 자금
        int money = Integer.parseInt(br.readLine());
        
        // 14일간의 주식 가격
        int[] stockPrice = new int[14];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < stockPrice.length; i++) {
            stockPrice[i] = Integer.parseInt(st.nextToken());
        }

        
        // 1. 준현이 전략 (BNP)
        int jMoney = money;  // 준현이의 자금
        int jStock = 0;      // 준현이의 보유 주식 수
        
        // 주식 구매: 자금이 있을 때마다 가능한 만큼 주식 구입
        for (int i = 0; i < stockPrice.length; i++) {
            if(jMoney >= stockPrice[i]){
                jStock += jMoney / stockPrice[i]; // 가능한 주식 수 구매
                jMoney %= stockPrice[i]; // 남은 자금
            }  
        }
        
        // 2. 성민이 전략 (TIMING)
        int sMoney = money;  // 성민이의 자금
        int sStock = 0;      // 성민이의 보유 주식 수
        int upCnt = 0;       // 주식 가격 상승 횟수
        int downCnt = 0;     // 주식 가격 하락 횟수
        
        // 주식 가격 변화를 따라가며 매매 타이밍 결정
        for (int i = 1; i < stockPrice.length; i++) {
            // 주식 가격이 상승한 경우
            if(stockPrice[i] > stockPrice[i - 1]){
                // 연속 상승이 2회 이상이면 주식을 팔고 자금 회수
                if(upCnt >= 2){
                    sMoney += (sStock * stockPrice[i]); // 보유 주식 팔기
                    sStock = 0; // 주식 팔고 주식 수 0으로 초기화
                }
                upCnt++;   // 상승 횟수 증가
                downCnt = 0; // 하락 횟수 초기화
            }
            // 주식 가격이 하락한 경우
            else if(stockPrice[i] < stockPrice[i - 1]){
                // 연속 하락이 2회 이상이면 주식 사기
                if(downCnt >= 2){
                    sStock += (sMoney / stockPrice[i]); // 주식 구매
                    sMoney %= stockPrice[i];  // 남은 자금
                }
                downCnt++;  // 하락 횟수 증가
                upCnt = 0;  // 상승 횟수 초기화
            }
        }

        // 3. 최종 자산 계산
        // 준현이의 최종 자산: 남은 자금 + 보유한 주식 수 * 마지막 날 주식 가격
        jMoney += (stockPrice[13] * jStock);
        
        // 성민이의 최종 자산: 남은 자금 + 보유한 주식 수 * 마지막 날 주식 가격
        sMoney += (stockPrice[13] * sStock);
        
        // 결과 출력: 비교하여 더 많은 자산을 가진 전략 출력
        if(jMoney > sMoney) {
            System.out.println("BNP");  // 준현이가 더 많은 자산을 가짐
        } else if(jMoney < sMoney) {
            System.out.println("TIMING");  // 성민이가 더 많은 자산을 가짐
        } else {
            System.out.println("SAMESAME");  // 두 전략이 동일한 자산을 가짐
        }
    }
}