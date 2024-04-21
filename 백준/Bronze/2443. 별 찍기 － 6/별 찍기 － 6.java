import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = N; i >= 1; i--) {
            // 공백 출력
            
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 출력
            for (int k = 1; k <= 2 * i-1; k++) {
                System.out.print("*");
            }
           
            
            // 줄 바꿈
            System.out.println();
        }
    }
}
