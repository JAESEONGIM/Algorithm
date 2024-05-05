import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currenttime = sc.next();
        String droptime = sc.next();
        String[] currentunit =currenttime.split(":");
        int h1 = Integer.parseInt(currentunit[0]);
        int m1 = Integer.parseInt(currentunit[1]);
        int s1 = Integer.parseInt(currentunit[2]);
        int current = h1 * 3600 + m1 * 60 + s1;
        String[] dropunit = droptime.split(":");
        int h2 = Integer.parseInt(dropunit[0]);
        int m2 = Integer.parseInt(dropunit[1]);
        int s2 = Integer.parseInt(dropunit[2]);
        int drop = h2 * 3600 + m2 * 60 + s2;


        int need = drop - current;
        if (need <= 0)
            need += 24 * 3600;

        int needH = need / 3600;
        int needM = (need % 3600) / 60;
        int needs = (need %60);
        System.out.printf("%02d:%02d:%02d",needH,needM,needs);
    }
}