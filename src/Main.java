/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
import java.util.Scanner;

public class Main {
    static int pilihan;
    static double dataSuhu;
    public static void main(String[] args) {
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        Main.inputData();
        do{
            Main.menuPiihan();
            switch (pilihan){
                case 1 :
                    Konversi convert = new Konversi(dataSuhu);
                    System.out.println("Suhu dalam Celcius : " + dataSuhu + "°C");
                    convert.konversiR();
                    convert.konversiF();
                    convert.konversiK();
                    convert.kondisiAir();
                    break;
                case 2 :
                    Main.inputData();
                    break;
                case 3 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Pilihan tidak tersedia. Mohon masukkan pilihan dengan benar!");
            }
        }while(true);  
    }
    
    public static void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan input data!");
        System.out.print("Suhu dalam Celcius : ");
        dataSuhu = input.nextFloat();
    }
    
    public static void menuPiihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan : ");
        System.out.println("1. Lihat Data Konversi");
        System.out.println("2. Edit Data Konversi");
        System.out.println("3. Keluar");
        pilihan = input.nextInt();
    }
}
