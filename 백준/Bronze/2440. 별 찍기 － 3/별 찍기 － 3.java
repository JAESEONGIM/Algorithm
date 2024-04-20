import java.util.*;
import java.util.Scanner;
public class Main{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
    int n = 0;
   n= sc.nextInt();
    //줄 n번 찍기
    for(int i=0; i <n;i++){
        //n줄당 n-i번찍기
for(int k = 0; k<n-i; k++){
System.out.print("*");

}System.out.println();

}



}

}