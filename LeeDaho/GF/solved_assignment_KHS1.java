package LeeDaho.GF;

import java.util.Scanner;

public class solved_assignment_KHS1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int vv = sc.nextInt();
        int cc = aa-bb;
        int mo = 0;
        int na = 0;

        mo = (vv-aa)/cc;
        na = (vv-aa)%cc;

        if(na==0){
            System.out.print(mo+1);
        }else{
            System.out.print(mo+2);
        }

    }
}
