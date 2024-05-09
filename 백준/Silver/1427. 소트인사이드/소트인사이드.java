import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int N = scanner.nextInt();
        
        // 수를 문자열로 변환하여 문자 배열로 분리
        char[] arr = Integer.toString(N).toCharArray();
        
        // 문자 배열을 내림차순으로 정렬
        Arrays.sort(arr);
        
        // 내림차순으로 정렬된 문자 배열을 뒤집기
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        
        // 결과 출력
        System.out.println(sb.toString());
        
        scanner.close();
    }
}
