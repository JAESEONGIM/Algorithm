import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a*b*c;
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        String strsum = Integer.toString(sum);

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < strsum.length(); j++){
                if(Character.getNumericValue(strsum.charAt(j))== i){
                    arr[i]=arr[i]+1;

                }
            }
        }

        for(int i =0; i < 10; i++){
            System.out.println(arr[i]);
        }

    }
}
