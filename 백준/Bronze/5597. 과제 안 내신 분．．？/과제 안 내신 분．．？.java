import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 	int a = 0;
		    int b = 0;
		int[] arr2 = new int [30];
		
		
		for(int i = 0 ; i < 28; i++) {
			int num = sc.nextInt();
            arr2[num-1]=1;
		}
		
		for(int i = 0; i < 30; i++){
            if(arr2[i]!=1){
                a=i+1;
                break;
            }
        }
       
        for(int i = 0; i < 30; i++){
            if(arr2[i]!=1){
                b=i+1;
                
            }
        }
        if(a < b){
            System.out.println(a);
        }
        System.out.println(b);
        
        
		
				
			}
		}
		
		
	

