import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a,b,c,cevre,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = input.nextInt();
        System.out.print("c kenarını giriniz : ");
        c = input.nextInt();
        cevre = a+b+c;
        alan=Math.round(Math.sqrt((cevre/2)*(cevre/2-a)*(cevre/2-b)*(cevre/2-c)));
        System.out.println("Üçgenin Alanı : " + alan);

    }
}