package LeeDaho.week_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class B1158_DDaoLee_Q5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 리스트 크기
        int K = Integer.parseInt(st.nextToken()); // K번째 제거

        /////////////////////////////////////////////////////////////////////

        // 방법 1: ListIterator를 사용
        // 장점:
        // - 삭제가 O(1)로 매우 빠름 (LinkedList에서 요소 삭제 시 인덱스 탐색 불필요)
        // - 순환 구조 안전하게 처리 가능
        // 단점:
        // - iterator 이동과 hasNext() 체크 등 조건문이 많아 작은 N에서는 오버헤드 발생
        // - 코드가 조금 복잡
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 1; i <= N; i++) list1.add(i); // 1~N까지 리스트 초기화

        ListIterator<Integer> cursor1 = list1.listIterator(); // 커서 초기화
        StringBuilder sb1 = new StringBuilder();
        sb1.append("<"); // 출력 형식 시작

        int count = 0; // K번째 요소 체크용 카운트
        while (!list1.isEmpty()) {
            if (!cursor1.hasNext()) cursor1 = list1.listIterator(); // 끝이면 처음으로 순환

            cursor1.next(); // 다음 요소로 이동
            count++;        // 이동 횟수 증가

            if (count == K) {
                cursor1.previous();          // 삭제할 요소 바로 앞으로 이동
                sb1.append(cursor1.next());  // K번째 요소 출력
                cursor1.remove();            // K번째 요소 삭제
                count = 0;                   // 카운트 초기화

                if (!list1.isEmpty()) sb1.append(", "); // 마지막 요소가 아니면 쉼표 추가
            }
        }

        sb1.append(">"); // 출력 형식 종료
        System.out.println(sb1);
        /////////////////////////////////////////////////////////////////////
        
        // 방법 2: remove(index) + cursor 계산 방식
        // 장점:
        // - 코드 단순, 직관적
        // - 작은 N에서는 반복문과 계산만으로 빠르게 동작
        // 단점:
        // - LinkedList에서 index 기반 remove는 내부적으로 O(n) 탐색 필요
        // - N이 커지면 속도가 느려짐 (최악 O(n^2))
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 1; i <= N; i++) list2.add(i); // 1~N까지 리스트 초기화

        StringBuilder sb2 = new StringBuilder();
        sb2.append("<"); // 출력 형식 시작
        int cursor2 = 0; // 현재 제거할 요소 인덱스

        while (!list2.isEmpty()) {
            cursor2 += (K - 1);             // K-1칸 이동
            cursor2 %= list2.size();        // 리스트 크기만큼 순환
            sb2.append(list2.remove(cursor2)); // K번째 요소 제거 및 출력
            if(!list2.isEmpty()) sb2.append(", "); // 마지막이 아니면 쉼표 추가
        }

        sb2.append(">"); // 출력 형식 종료
        System.out.println(sb2);
    }    
}
