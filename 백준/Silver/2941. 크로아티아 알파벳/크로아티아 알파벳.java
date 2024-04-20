import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'c') {
                if (i < s.length() - 1 && (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-')) {
                    a++;
                    i++; // 다음 문자도 처리되었으므로 인덱스를 증가시킴
                } else {
                    a++;
                }
            } else if (currentChar == 'd') {
                if (i < s.length() - 2 && s.charAt(i + 1) == 'z' && s.charAt(i + 2) == '=') {
                    a++;
                    i += 2; // 'dz='가 한 문자로 처리되었으므로 인덱스를 2 증가시킴
                } else if (i < s.length() - 1 && s.charAt(i + 1) == '-') {
                    a++;
                    i++; // 다음 문자도 처리되었으므로 인덱스를 증가시킴
                } else {
                    a++;
                }
            } else if (currentChar == 'l' || currentChar == 'n') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'j') {
                    a++;
                    i++; // 다음 문자도 처리되었으므로 인덱스를 증가시킴
                } else {
                    a++;
                }
            } else if (currentChar == 's' || currentChar == 'z') {
                if (i < s.length() - 1 && s.charAt(i + 1) == '=') {
                    a++;
                    i++; // 다음 문자도 처리되었으므로 인덱스를 증가시킴
                } else {
                    a++;
                }
            } else {
                a++;
            }
        }
        // 크로아티아 알파벳 개수 출력
        System.out.println(a);
    }
}
