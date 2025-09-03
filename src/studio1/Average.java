package studio1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter value for n1");
        int n1 = in.nextInt();
        System.out.print("enter value for n2");
        int n2 = in.nextInt();
        int n3 = (n1 + n2) / 2;
        System.out.print(n3);
}
}
