package LeeDaho.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309_DDaoLee {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int heightSum = 0;
        int[] height = new int[9];

        for (int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            heightSum += height[i];
        }

        Arrays.sort(height);

        int fake1 = -1;
        int fake2 = -1;
        boolean isfound = false;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] + height[j] == heightSum - 100) {
                    fake1 = i;
                    fake2 = j;
                    for (int k = 0; k < height.length; k++) {
                        if(k != fake1 && k != fake2){
                            System.out.println(height[k]);
                        }
                    }
                    isfound = true;
                    break;
                }
            }
            if (isfound) break;
        }
    }
}
