package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B20546_DDaoLee_Special {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int[] stockPrice  = new int[14];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < stockPrice.length; i++) {
            stockPrice[i] = Integer.parseInt(st.nextToken());
        }

        
        //  준현이
        int jMoney = money;
        int jStock = 0;
        for (int i = 0; i < stockPrice.length; i++) {
            if(jMoney >= stockPrice[i]){
                jStock += jMoney / stockPrice[i];
                jMoney %= stockPrice[i];
            }  
        }
        
        // 성민이
        int sMoney = money;
        int sStock = 0;
        boolean isStockBought = false;

        for (int i = 1; i < stockPrice.length; i++) {
            if (stockPrice[i] > stockPrice[i - 1]) { // 주식 가격 상승
                if (isStockBought) {
                    sMoney += sStock * stockPrice[i]; // 주식 팔기
                    sStock = 0;
                }
                isStockBought = false;
            } else if (stockPrice[i] < stockPrice[i - 1]) { // 주식 가격 하락
                if (!isStockBought) {
                    sStock += sMoney / stockPrice[i]; // 주식 사기
                    sMoney %= stockPrice[i];
                }
                isStockBought = true;
            }
        }

        int jResult = jMoney + (stockPrice[13] * jStock);
        int sResult = sMoney + (stockPrice[13] * sStock);
        if(jResult > sResult) System.out.println("BNP");
        else if(jResult < sResult) System.out.println("TIMING");
        else System.out.println("SAMESAME");
    }
}
