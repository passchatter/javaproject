package com.bangunDatar;
public class Persegi {
    public int sisi, L, K;
    public Persegi(int sisi){
       this.sisi = sisi;
    }

    public void KelilingPersegi(){
        K = 4 * sisi;
        System.out.printf("keliling = %d \n", K);
    }

    public void LuasPersegi(){
        L = sisi * sisi;
        System.out.printf("Luas = %d \n", L);
    }
}
