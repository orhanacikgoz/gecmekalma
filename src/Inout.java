import java.awt.desktop.AboutEvent;
import java.util.Scanner;

public class Inout {


    public static void main(String[] args) {

        int mat, fiz, kim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");

        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fiz=inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kim =inp.nextInt();

        int ortalama  = (mat   + fiz+kim)/3   ;
        System.out.println("Ortalamaniz: " + ortalama);

         //  boolean sonuc = (ortalama <= 50);
        // System.out.println("Kaldiniz");
        // boolean sonuc2 = (ortalama >= 50 );
        // System.out.println("Gectiniz");

        if (ortalama>=85) {
            System.out.println("Donem Sonu Harf Notu: AA ");
        }
        else if (ortalama>=70) {
            System.out.println("Donem Sonu Harf Notu: BB");
        }
        else if (ortalama>=60) {
            System.out.println("Donem Sonu Harf Notu: CC");
        }
        else if (ortalama>=40) {
            System.out.println("Donem Sonu Harf Notu: DD");
        }


































    }






}
