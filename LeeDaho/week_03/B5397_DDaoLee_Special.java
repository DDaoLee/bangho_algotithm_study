package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class B5397_DDaoLee_Special {

    // 키 입력에 따라 커서(ListIterator<Character>)와 문자열(LinkedList<Character>)을 조작하는 메서드
    public static void keylogging(ListIterator<Character> iter, char ch){

        switch(ch){
            case '<' : // 왼쪽 화살표 : 커서를 왼쪽으로 이동
                if (iter.hasPrevious()) iter.previous();
                break;

            case '>' : // 오른쪽 화살표 : 커서를 오른쪽으로 이동
                if (iter.hasNext()) iter.next();
                break;

            case '-' : // 백스페이스 : 커서 왼쪽의 문자 삭제
                if(iter.hasPrevious()) {
                    iter.previous();   // 삭제할 위치로 이동
                    iter.remove();    // 문자 제거
                }
                break;

            default : // 일반 문자 입력 : 현재 커서 위치에 문자 삽입
                iter.add(ch);
                break;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine()); // 테스트 케이스 개수 입력

        String testCase = "";
        for (int i = 0; i < tCase; i++) {
            testCase = br.readLine(); // 테스트케이스 입력
            
            // 입력된 문자열을 저장할 리스트 (LinkedList 사용 → 중간 삽입/삭제 효율적)
            LinkedList<Character> input = new LinkedList<>();
            // 커서 위치를 추적할 ListIterator
            ListIterator<Character> cursor = input.listIterator();

            // 입력 문자열의 각 문자를 읽어 keylogging 동작 수행
            for (char ch : testCase.toCharArray()){
                keylogging(cursor, ch);
            }

            // 최종적으로 완성된 비밀번호를 StringBuilder로 변환
            StringBuilder pwd = new StringBuilder();
            for (char c : input) pwd.append(c);

            // 결과 출력
            System.out.println(pwd);
        }

    }
    
}
