

import java.util.*;
public class Main{

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String stra= String.valueOf(a);
    String strb= String.valueOf(b);
    StringBuilder reverseda = new StringBuilder(stra).reverse();
    StringBuilder reversedb = new StringBuilder(strb).reverse();
    int numa =Integer.parseInt(reverseda.toString());
    int numb =Integer.parseInt(reversedb.toString());
    if(numa>=numb){
    System.out.println(numa);
}else{
        System.out.println(numb);
    }
       
    

}

}
