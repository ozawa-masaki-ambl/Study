import java.util.Random;
import java.util.Scanner;

public class Main {
    /**練習1-1*/
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    int a=1;
    while (a <=100){
       sb.append(a++).append(",");
    }
    String s = sb.toString();
    String[] strings = s.split(",");
    System.out.println(s);
    System.out.println(strings[3]);
    }
    /**練習1-2*/
    public  String concat(String folder, String file){
        if (!folder.endsWith("¥¥")){
            folder +="¥¥";
        }
        return folder+file;
    }
    /**練習1-3*/
//    .*
//    A¥d{1,2}
//    U[A-Z]{3}
}