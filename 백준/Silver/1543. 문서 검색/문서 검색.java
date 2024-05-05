import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        int startIndex = 0;
        while (true){
            int findIndex = str.indexOf(str2, startIndex);
            if(findIndex < 0){
                break;
            }
            startIndex = findIndex + str2.length();
            count++;
        }
        System.out.println(count);



    }
}
