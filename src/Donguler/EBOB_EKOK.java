package Donguler;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1,ii;
        int bolunenn = 0;
        int bolunena = 0;
        int EBOB=1, EKOK;
        System.out.print("Bir sayi giriniz: ");
        int n = scan.nextInt();
        System.out.print("Bir sayi daha giriniz: ");
        int a = scan.nextInt();

        if(n<=0||a<=0){
            System.out.println("Pozitif sayilar giriniz! ");
        }
        while (n >= i) {
            if (n % i == 0) {
                bolunenn = i;
                //   System.out.println("bolunenn "+bolunenn);
            }
            if (a % i == 0) {
                bolunena = i;
                //   System.out.println("bolunena "+bolunena);
            }
            if (bolunenn == bolunena) {
                EBOB=bolunenn;
              //  System.out.println("esit " + bolunen);
            }
            i++;
        }
        System.out.println("EBOB: "+ EBOB);

        //EKOK=(n*a)/EBOB
        EKOK=(n*a)/EBOB;
        System.out.println("EKOK: "+ EKOK);

     /*   if(n>=a){
            ii=n;
        }
        else{
            ii=a;
        }*/
        int kat1=1,kat2=1;
        int r=1;
        while(kat1!=kat2){
            kat1*=i;
            System.out.println("kat1: "+kat1);
            kat2*=i;
            System.out.println("kat2: "+kat2);
        }
    }
}

