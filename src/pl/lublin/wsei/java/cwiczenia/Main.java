package pl.lublin.wsei.java.cwiczenia;


import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;

/**
 * Komentarz javadoc w kodzie źródłowym
 *
 * @author Piotr Źróbek
 * @version Lab1
 */
//public class Main {
//    public static void main(String[] args) {
//        //Komenda wypisująca tekst na ekranie
//        System.out.println("Hello Java World\n");
//
//    /*
//    kilka razy użyć print
//    to samo, z użyciem println
//    wrócić do print, ale użyć znacznika końca linii
//    */
//        System.out.print("Ala");
//        System.out.print("ma");
//        System.out.print("kota");
//
//        System.out.print("\n");
//
//        System.out.print("Ala\n");
//        System.out.print("ma\n");
//        System.out.print("kota\n");

//// zadeklarować trzy zmienne typów int, double i string i wypisać ich wartość za pomocą printf;
//        int a = 3;
//        double b = 4.21;
//        String s = "jakiś tekst";
//        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

////wypisać na ekranie tekst Nazywaliśmy to „witaminą B3” (trzeba użyć prefiksowania \”)
//        System.out.println("Nazywaliśmy to \"witaminą B3\"\n");

//// wypisać tabelkę funkcji sin dla kątów od 0 do 360 stopni co 10 stopni:
//        System.out.printf("alfa\tsin(alfa)\n");
//        for (int i = 0; i < 370; i+=10)
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*Math.PI));

//// wypisać tabelkę logarytmów o podstawie 2 oraz akumulowaną sumę kolejnych potęg liczby 2
//        System.out.print("arg\tlog2(arg)\tsum(arg)\n");
//        for (int i = 1, pow = 1; i < 100; i *= 2, pow++) {
//            System.out.printf("%-5s\t%-5s\t%5s\t\n", i, log2(i), sumPow(pow));
//            }
//    }
//            static int log2(int arg) {
//                return (int) (Math.log(arg) / Math.log(2));
//            }
//            static int sumPow(int arg) {
//                var sum = 0;
//                for (int j = 0; j < arg; j++) {
//                    sum += Math.pow(2, j);
//                }
//                return sum;

//// Dodawanie liczb wprowadzonych przez użytkownika
//        Scanner input = new Scanner(System.in);
//        int num1, num2;
//        System.out.print("Podaj pierwszą liczbę: ");
//            num1 = input.nextInt();
//        System.out.print("Podaj drugą liczbę: ");
//            num2 = input.nextInt();
//        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

////Sprawdzenie działania programu z wykorzystaniem pętli do, która powtarza pytanie o argumenty i wypisuje wynik
//        Scanner wpisz = new Scanner(System.in);
//        int liczba1 = 0, liczba2 = 0;
//        do {
//            System.out.print("Podaj pierwszą liczbę: ");
//            liczba1 = wpisz.nextInt();
//            if (liczba1 == 0) break;
//            System.out.print("Podaj drugą liczbę: ");
//            liczba2 = wpisz.nextInt();
//            if (liczba2 == 0) break;
//            System.out.printf("Wynik dodawania %d + %d = %d%n", liczba1, liczba2, liczba1 + liczba2);
//        } while (true);

//// Program do wypisania postaci dwójkowej i szesnastkowej podanej przez użytkownika liczby
//        Scanner input = new Scanner(System.in);
//        int num1;
//        System.out.print("Podaj liczbę, aby wypisać w postaci dwójkowej i szesnastkowej: ");
//            num1 = input.nextInt();
//        System.out.printf("DEC = %d, BIN = %s, HEX = %S", num1, Integer.toBinaryString(num1), Integer.toHexString(num1));
//

//// Udoskonalony powyższy program z zastosowaniem metody leftPad
//public class Main {
//    public static String leftPad(String aText, char aChar, int aWidth){
//        String res = aText;
//        for (int i = 0; i< aWidth - aText.length();i++)
//            res = aChar + res;
//        return res;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int num1;
//        System.out.print("Podaj liczbę, aby wypisać w postaci dwójkowej i szesnastkowej: ");
//        num1 = input.nextInt();
//        System.out.printf("DEC = %d, BIN = %s, HEX = %S", num1,
//                leftPad(Integer.toBinaryString(num1),'0',8),
//                leftPad(Integer.toHexString(num1),'0',5));

public class Main {
    public static void main(String[] args) {
        System.out.printf("%s%n",Account.translit("миколай миколай"));
        System.out.printf("%s%n",Account.translit("Гарри Каспаров"));
        System.out.printf("%s%n",Account.translit("Андрій Шевченко"));
        System.out.printf("%s%n",Account.translit("Віталій Кличко"));
    }
}


