package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	//Scrie un program care afiseaza suma cifrelor unui numar.

        Scanner scanNumar=new Scanner(System.in);
        System.out.println("Introduceti un numar pentru care doriti sa stiti care este suma cifrelor: ");
        int n=scanNumar.nextInt();
        int sum=0;
        int cifraCrt2;
        while(n>0){
            cifraCrt2=n%10;
            System.out.println("Cifra curenta este "+cifraCrt2);
            n=n/10;
            System.out.println("Valoarea nr este " + n);
            sum+=cifraCrt2;
        }
        System.out.println("Suma nr " +n+" este "+ sum);
    }
}
