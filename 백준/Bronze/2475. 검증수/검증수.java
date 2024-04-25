import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 고유번호의 처음 5자리 숫자를 입력받기
        int[] digits = new int[5];
        for (int i = 0; i < 5; i++) {
            digits[i] = scanner.nextInt();
        }
        
        // 검증수 계산
        int sum = 0;
        for (int digit : digits) {
            sum += digit * digit;
        }
        int verificationNumber = sum % 10;
        
        // 검증수 출력
        System.out.println(verificationNumber);
    }
}
