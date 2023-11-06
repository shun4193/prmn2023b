package lecture02;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] num = new int[5];
        for(int i = 0; i < num.length; i++) {
            System.out.printf("数字%dつ目 ", i + 1);
            num[i] = scan.nextInt();
            System.out.println();
        }

        Keisan kei = new Keisan();
        int sum = kei.sum(num);
        kei.resultPrint(sum);
    }
}
