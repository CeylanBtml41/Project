import java.util.Scanner;

public class OrtalamaHesaplama {


            /*
    Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve
     bu derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

       Fizik Notunuz : 70
       Matematik Notunuz : 40
       Türkçe Notunuz : 30
       Kimya Notunuz : 100
       Müzik Notunuz : 60
       Tarih Notunuz : 80
       Ortalamanız : 63.0


            */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int fizik,matematik,turkce,kimya,muzik,tarih;

        double sonuc=0;

        System.out.print("Fizik notunuzu giriniz : ");
        fizik=scan.nextInt();

        System.out.print("Matematik notunuzu gırınız : ");
        matematik=scan.nextInt();

        System.out.print("Turkce notunuzu gırınız : ");
        turkce=scan.nextInt();

        System.out.print("Kimya notunuzu gırıız : ");
        kimya=scan.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik=scan.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih=scan.nextInt();

        sonuc = (fizik + matematik + turkce + kimya + muzik + tarih) / 6;

        System.out.println(sonuc);






    }

}
