import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        if (N == 0) {
            System.out.println("YONSEI");
        } else if (N == 1) {
            System.out.println("Leading the Way to the Future");
        } else {
            System.out.println("Invalid input"); // 추가적인 입력 검증
        }
        
        scanner.close();
    }
}
