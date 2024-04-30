

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int firstN = N;
        String strN = "";
        int count = 0;
 
        do {
           int tensN = N / 10;  //두자리수의 첫번째자리 구하는법
           int ilsN = N%10;     //두자리수의 두번째자리 구하는법
           int sum = tensN + ilsN;
           int newNumber = ilsN * 10 + sum % 10;  
           // 일의자리 숫자에 10을 곱한거에  십의자리와 일의자리 숫자를 더한값의 일의자리를 더한다.
           N = newNumber;
            count++;
        } while (N != firstN);

        System.out.println(count);
        
    }
}
