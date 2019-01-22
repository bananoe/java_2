import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    while(true) {
        System.out.println("please enter a number to check if prime");
        int num = in.nextInt();


        if (num % 2 == 0) {
            System.out.println("Not a prime number");
        } else if (num % 2 == 1) {
            System.out.println("Prime Number");
        } else if (num == 1) {
            System.out.println("Not Prime number");
        }

    }
    }
}
