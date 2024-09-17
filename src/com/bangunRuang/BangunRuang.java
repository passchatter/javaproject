package com.bangunRuang;
import java.util.Scanner;

public class BangunRuang {
    public void PilihBangunRuang(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("masukkan number pilihan");
        int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                Kubus kubus = new Kubus();
                kubus.VolumeKubus();
                break;
            case 2:
                Balok balok = new Balok();
                balok.VolumeBalok();
                break;
            default:
                System.out.println("pilih sesui number");
        }

        input.close();
    }
}
