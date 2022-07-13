import java.util.Scanner;

public class Calculator {
    static void sum(int a, int b) {
        int result;
        result = a + b;
        System.out.println("Toplama Islemi Sonucu : " + result);
    }

    static void minus(int a, int b) {
        int result;
        result = a - b;
        System.out.println("Cikarma Islemi Sonucu : " + result);
    }

    static void times(int a, int b) {
        int result;
        result = a * b;
        System.out.println("Carpma Islemi Sonucu : " + result);
    }

    static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bolum Tanimsizdir.");
        }
        int result;
        result = a / b;
        System.out.println("Bolme Islemi Sonucu : " + result);
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Us Alma Islemi Sonucu : " + result);
    }

    static void modAlma(int a, int b) {
        int result;
        result = a % b;
        System.out.println("Mod Alma Sonucu : " + result);
    }

    static void rectangle(int a, int b) {
        int field, environment;
        environment = 2 * (a + b);
        field = a * b;
        System.out.println("Dikdortgenin Cevresi : " + environment);
        System.out.println("Dikdortgenin Alani : " + field);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = """
                1 - Toplama Islemi
                2 - Cikarma Islemi
                3 - Carpma Islemi
                4 - Bolme Islemi
                5 - Uslu Sayi Hesaplama
                6 - Mod Alma
                7 - Dikdortgen Alan ve Cevre Hesabi
                0 - Cikis !!""";

        System.out.println(menu);
        while (true) {
            System.out.print("Yapmak Istediginiz Islemi Seciniz : ");
            select = inp.nextInt();
            if (select == 0) {
                System.out.println("Iyi Gunler !!");
                break;
            }

            System.out.print("Ilk Sayiyi Giriniz : ");
            int a = inp.nextInt();
            System.out.print("Ikinci Sayiyi Giriniz : ");
            int b = inp.nextInt();
            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    modAlma(a, b);
                    break;
                case 7:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Gecersiz Bir Islem Girdiniz");
            }
        }
    }
}
