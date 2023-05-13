import java.util.Scanner;

public class vucutKitleIndex {


        /*
    Proje Konusu
    kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın

    Örnek Çıktı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173

    Formül : Kilo (kg) / Boy(m) * Boy(m)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scan.nextInt();

        double indx = kilo / (boy * boy);

        System.out.println("Indx = " + indx);


        if (indx < 18.5) {

            System.out.println("Zayıfsınız");

        } else if (18.5 <= indx & indx <= 24.9) {

            System.out.println("İdealsıznız");

        } else if (indx >= 25 & indx <= 29.9) {
            System.out.println("Sısmansınız");

        } else if (indx >= 30 & indx <= 34.9) {
            System.out.println("Obezsınız");
        } else if (indx > 35) {
            System.out.println("Asırı sısmansınız");

        }
    }
}
