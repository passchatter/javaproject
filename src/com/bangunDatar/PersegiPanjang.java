package com.bangunDatar;
public class PersegiPanjang {
    public int p, l, L, K;

    public PersegiPanjang(int p, int l){
        this.p = p;
        this.l = l;
    }

    public void LuasPersegiPanjang(){
        L = p * l;
        System.out.printf("luas persegi panjang = %d \n", L);
    }

    public void KelilingPersegiPanjang(){
        K = 2 * (p+l);
        System.out.printf("Keliling persegi panjang = %d \n", K);
    }

}
