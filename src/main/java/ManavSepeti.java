import java.util.Scanner;

public class ManavSepeti {

       /*

   Proje Konusu :
     kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.


       Ürün Kg Fiyatları
        Salatalık : 3,14 TL
        Elma : 4,11 TL
        Kabak : 2,22 TL
        Domates: 0,95 TL
        Patlıcan : 7,00 T
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 4.11;
        double domates = 4.11;
        double patlican = 4.11;

        System.out.println("Salatalık kac kilo aldınız");
        double salatalikKilo = scan.nextDouble();

        System.out.println("elma kac kilo aldınız");
        double elmaKilo = scan.nextDouble();

        System.out.println("kabak kac kilo aldınız");
        double kabakKilo = scan.nextDouble();


        System.out.println("Domates kac kilo aldınız");
        double domatesKilo = scan.nextDouble();


        System.out.println("Patlıcan kac kilo aldınız");
        double patllicanKilo = scan.nextDouble();

        double toplam = (salatalik * salatalikKilo);
        toplam += (elma * elmaKilo);
        toplam += (kabak * kabakKilo);
        toplam += (domates * domatesKilo);
        toplam += (patlican * patllicanKilo);

        System.out.println("toplam = " + toplam + "TL");


    }
}

