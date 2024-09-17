package com.Berhitung;
import java.util.Scanner;

public class AppBerhitung {
    public void PilihHitung(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kalkulator");
        System.out.println("2. Saham");
        System.out.println("silahkan pilih number berhitung : ");
        int pilihan = input.nextInt();
       

        switch(pilihan){
            case 1:
                Kalkulator kalkulator = new Kalkulator();
                kalkulator.Process();
                break;
            case 2:
                Saham saham = new Saham();
                saham.Persentase();
                break;
            default:
                System.out.println("number tidak sesuai");
        }
        input.close();
    }
}
