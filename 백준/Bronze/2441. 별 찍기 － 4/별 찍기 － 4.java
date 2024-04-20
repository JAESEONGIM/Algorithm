import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        
        
            // 별 출력
            for (int k = 0; k < N; k++) {
                if(k!=0){
                    
                        for(int j = 0; j < k; j++){
                            System.out.print(" ");
                        }}
                for(int i = 0; i < N-k; i++){
                     
                    System.out.print("*");
                }System.out.println();
                
            }

        }
    }

