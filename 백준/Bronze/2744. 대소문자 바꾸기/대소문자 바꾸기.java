import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        String word = scanner.nextLine();
        
        // 결과를 저장할 StringBuilder 초기화
        StringBuilder result = new StringBuilder();
        
        // 각 문자에 대해 대소문자 변경하여 결과에 추가
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (Character.isLowerCase(currentChar)) { // 소문자인 경우 대문자로 변경
                result.append(Character.toUpperCase(currentChar));
            } else if (Character.isUpperCase(currentChar)) { // 대문자인 경우 소문자로 변경
                result.append(Character.toLowerCase(currentChar));
            } else { // 알파벳이 아닌 경우 그대로 추가
                result.append(currentChar);
            }
        }
        
        // 결과 출력
        System.out.println(result.toString());
        
        scanner.close();
    }
}
