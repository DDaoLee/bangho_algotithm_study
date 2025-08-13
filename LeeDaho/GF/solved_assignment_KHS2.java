package LeeDaho.GF;

import java.util.Scanner;
import java.util.Arrays;

public class solved_assignment_KHS2 {
    public static void main(String[] args) {
            
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {1,2,3,4,5,6,7};
        int sum = 0;
        int ch1 = 0;
        int ch2 = 0;

        Scanner aaa = new Scanner(System.in);

        for(int i=0; i<9; i++){
            arr[i] = aaa.nextInt();
            sum += arr[i];
        }

        for(int i=0; i<8; i++){
            for(int k=i+1; k<9; k++){
                if(arr[i]+arr[k]==sum-100){
                    ch1 = i;
                    ch2 = k;
                    break;
                }
            }
            if(ch1!=0){
                break;
            }
        }

        int n = 0;

        for(int i=0; i<9; i++){
            if(i!=ch1 && i!=ch2){
                arr2[n]=arr[i];   
                n++;             
            }
        }

        Arrays.sort(arr2);

        for (int j=0; j<7; j++){
            System.out.println(arr2[j]);
        }

    }
}

