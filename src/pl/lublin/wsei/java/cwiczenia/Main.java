package pl.lublin.wsei.java.cwiczenia;


import java.util.Scanner;

/**
 * Komentarz javadoc w kodzie �r�d�owym
 *
 * @author Piotr �r�bek
 * @version Lab1
 */
public class Main {
    public static void main(String[] args) {
//        //Komenda wypisuj�ca tekst na ekranie
//        System.out.println("Hello Java World\n");
//
//    /*
//    kilka razy u�y� print
//    to samo, z u�yciem println
//    wr�ci� do print, ale u�y� znacznika ko�ca linii
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

//// zadeklarowa� trzy zmienne typ�w int, double i string i wypisa� ich warto�� za pomoc� printf;
//        int a = 3;
//        double b = 4.21;
//        String s = "jaki� tekst";
//        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

////wypisa� na ekranie tekst Nazywali�my to �witamin� B3� (trzeba u�y� prefiksowania \�)
//        System.out.println("Nazywali�my to \"witamin� B3\"\n");

//// wypisa� tabelk� funkcji sin dla k�t�w od 0 do 360 stopni co 10 stopni:
//        System.out.printf("alfa\tsin(alfa)\n");
//        for (int i = 0; i < 370; i+=10)
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*Math.PI));

//// wypisa� tabelk� logarytm�w o podstawie 2 oraz akumulowan� sum� kolejnych pot�g liczby 2
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

// Dodawanie liczb wprowadzonych przez u�ytkownika
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Podaj pierwsz� liczb�: ");
            num1 = input.nextInt();
        System.out.print("Podaj drug� liczb�: ");
            num2 = input.nextInt();
        System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);

    }
}

