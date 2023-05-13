import java.util.Scanner;

public class Hipotenus {
    //kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
    //alan ve cevre bulunuz




    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("1. kenarı gırınız : ");
        int a = scan.nextInt();

        System.out.print("2.kenarı gırınız : ");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a) + (b*b));

        System.out.println("hipotenus : " + (int)c );

        int cevre =a+b+(int) c;
        System.out.println("cevre = " + cevre);

        int alan= a*b /2;
        System.out.println("alan = " + alan);

    }
}
