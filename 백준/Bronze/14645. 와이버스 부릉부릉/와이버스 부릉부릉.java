import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // 출발역에서의 탑승 인원
        int currentPassengers = K;

        // 각 정거장에서 탑승/하차 인원 처리
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();  // 탑승 인원
            int B = scanner.nextInt();  // 하차 인원
            
            currentPassengers += A;  // 탑승 인원 추가
            currentPassengers -= B;  // 하차 인원 감소
        }

        // 종착역에서 모든 승객이 내리므로 운전수 이름 출력
        System.out.println("비와이");

        // Scanner 닫기
        scanner.close();
    }
}
