package Giris;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Mat notunuz:");
        mat=keyboard.nextInt();

        System.out.println("Fizik notunuz:");
        fizik=keyboard.nextInt();

        System.out.println("Kimya notunuz:");
        kimya=keyboard.nextInt();

        System.out.println("Tarih notunuz:");
        tarih=keyboard.nextInt();

        System.out.println("Muzik notunuz:");
        muzik=keyboard.nextInt();

        System.out.println("Turkce notunuz:");
        turkce=keyboard.nextInt();

        double ortalama;
        ortalama=(mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.println("Ortalamaniz: " +ortalama);

        System.out.println(ortalama>60 ? "Sinifi Gecti" : "Sinifta Kaldi");

    }
}
