import java.util.Scanner;

public class KdvTutari {
         /*
     kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
       (Not : KDV tutarını 18% olarak alın)

       Tutar Giriniz : 100
       KDV Oranı : %18
       KDV Tutarı : 18.00
       KDV'li Tutar : 118.0

            */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double rate = 18;

        System.out.print("Bir tutar giriniz : ");
        double tutar = scan.nextDouble();

        double kdvTutar = tutar * (rate / 100);

        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV Oran = %  " + (int) rate);
        System.out.println("KDV Tutarı = " + kdvTutar);
        System.out.println("KDV'li Tutar = " + kdvliTutar);


    }
}
