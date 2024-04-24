import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 두 개의 정수 A와 B 입력받기
        BigInteger A = new BigInteger(sc.next());
        BigInteger B = new BigInteger(sc.next());
        
        // A와 B를 더한 결과 출력
        System.out.println(A.add(B));
    }
}
