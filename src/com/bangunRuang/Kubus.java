package com.bangunRuang;
import java.util.Scanner;

public class Kubus {
    public int sisi, volume;
    public Kubus(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan sisi : ");
        sisi = input.nextInt();
        input.close();
    }

    public void VolumeKubus(){
        volume = sisi*sisi*sisi;
        System.out.printf("volumen kubus = %d", volume);
    }

}
