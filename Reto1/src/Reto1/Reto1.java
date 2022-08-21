package Reto1;

import java.util.Scanner;

public class Reto1 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int j67;
        int m15;
        int r99;
        String value = "";
        System.out.print("Introduzca el valor de J67: ");
        j67 = sc.nextInt();
        m15 = (j67 * 2) + 4;
        r99 = (m15 + j67) / 5;

        if(r99 >= 0 && r99 <= 20){
            value = "UNO";
        } else if (r99 >= 21 && r99 <= 40) {
            value = "DOS";
        } else if (r99 >= 41 && r99 <= 80) {
            value = "TRES";
        }else {
            value = "CUATRO";
        }
        System.out.println(j67 +" "+m15+" "+r99+"\n"+value);
    }
}
