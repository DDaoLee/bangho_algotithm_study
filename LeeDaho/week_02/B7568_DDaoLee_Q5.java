package LeeDaho.week_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 사람의 몸무게, 키, 그리고 순위를 저장하는 클래스
class Person {
    int weight; // 몸무게
    int height; // 키
    int rank;   // 덩치 순위

    // 생성자: 초기 순위(rank)는 1로 설정
    Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
        this.rank = 1;
    }
}

public class B7568_DDaoLee_Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수 입력
        int headCount = Integer.parseInt(br.readLine());

        // 사람 정보를 저장할 배열
        Person[] people = new Person[headCount];

        // 각 사람의 몸무게와 키 입력
        for (int i = 0; i < headCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()); // 몸무게
            int height = Integer.parseInt(st.nextToken()); // 키
            people[i] = new Person(weight, height);    // Person 객체 생성 후 배열에 저장
        }

        // 모든 사람 비교를 통해 순위 계산(자기 자신과의 비교는 자연스레 건너띄어짐)
        for (int i = 0; i < people.length; i++) { // 기준 사람 i
            for (int j = 0; j < people.length; j++) { // 비교 대상 사람 j
                // j가 i보다 몸무게와 키 모두 클 경우, i의 순위 +1
                if ((people[i].weight < people[j].weight) && (people[i].height < people[j].height)) {
                    people[i].rank++;
                }
            }
        }

        // 계산된 순위 출력 (공백 구분, 한 줄)
        for (int i = 0; i < headCount; i++) {
            System.out.print(people[i].rank + " ");
        }
    }
}