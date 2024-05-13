import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int foundingYear = 1946;
        int anniversary = year - foundingYear;
        System.out.println(anniversary);
    }
}
