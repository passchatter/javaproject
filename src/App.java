import java.util.Scanner;

import com.bangunDatar.BangunDatar;
import com.bangunRuang.BangunRuang;
import com.Berhitung.AppBerhitung;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.println("1. Bangun Datar");
    System.out.println("2. Bangun Ruang");
    System.out.print("silahkan pilih number bangun datar dan bangun ruan : ");
    int pilihan = input.nextInt();

    switch(pilihan){
        case 1:
            BangunDatar bangunDatar = new BangunDatar();
            bangunDatar.PilihBangundatar();
            break;
        case 2:
            BangunRuang bangunRuang = new BangunRuang();
            bangunRuang.PilihBangunRuang();
            break;
        case 3:
            AppBerhitung appBerhitung = new AppBerhitung();
            appBerhitung.PilihHitung();
            break;
        default:
            System.out.println("pilihan tidak sesuai");
    }
    
     input.close();
    }

}
