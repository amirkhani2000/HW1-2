package Base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Student mehdi = new Student();
    Scanner input = new Scanner(System.in);
    mehdi.zaban = input.nextFloat();
    mehdi.varzesh = input.nextFloat();
    mehdi.fizik = input.nextFloat();
    mehdi.andishe = input.nextFloat();
    mehdi.math = input.nextFloat();
    System.out.println(mehdi.average());
    System.out.println(mehdi.cheack());

    }
}
