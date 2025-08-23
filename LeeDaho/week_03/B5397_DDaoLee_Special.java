package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class B5397_DDaoLee_Special {

    public static void keylogging(ListIterator<Character> iter, char ch){

        switch(ch){
            case '<' :
                if (iter.hasPrevious()) iter.previous();
                break;
            case '>' :
                if (iter.hasNext()) iter.next();
                break;
            case '-' :
                if(iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();    
                }
                break;
            default :
                iter.add(ch);
                break;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());

        String testCase = "";
        for (int i = 0; i < tCase; i++) {
            testCase = br.readLine();
            LinkedList<Character> pwd = new LinkedList<>();
            ListIterator<Character> cursor = pwd.listIterator();

            for (char input : testCase.toCharArray()){
                keylogging(cursor,input);
            }

            StringBuilder sb = new StringBuilder();
            for (char c : pwd) sb.append(c);
            System.out.println(sb);
            
        }

    }
    
}
