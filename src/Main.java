import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi yılın artık yıl olup, olmadığını merak ediyorsunuz : ");
        yil = input.nextInt();
        if (yil % 4 == 0) {
            System.out.println(yil + " yıl artık yıldır...");
        } else {
            System.out.println(yil + " yıl artık yıl değildir...");
        }
        System.out.println("Program Bitti!...");
    }
}