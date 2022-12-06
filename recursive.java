import java.util.Scanner;

public class recursive {
    static void rec() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz: ");
        int sayi = input.nextInt();
        int temp = sayi;
        if (sayi > 0) {
            for (int i = sayi; i > (-1 * sayi); i -= 5) {
                sayi = i;
                System.out.println("sayının şu anki değeri => " + sayi);
            }
            if (sayi < 0) {
                for (int j = sayi; j <= temp; j += 5) {
                    sayi = j;
                    System.out.println("sayının şu anki değeri => " + sayi);
                }
            }

        }
    }

    public static void main(String[] args) {
        rec();
    }
}
