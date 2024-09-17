package com.bangunRuang;

import java.util.Scanner;
public class Balok {
    public int p,l,t,volume;
    public Balok(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan panjang : ");
        p = input.nextInt();

        System.out.println("masukkan lebar");
        l = input.nextInt();

        System.out.println("masukkan tinggi");
        t = input.nextInt();
        input.close();
    }
    public void VolumeBalok(){
        volume = p * l * t;
        System.out.printf("volume balok = %d", volume);
    }
}
