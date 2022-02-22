/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class Konversi {
    
    double dataSuhu,hasil;
    public Konversi(double dataSuhu){
        this.dataSuhu = dataSuhu;
    }
    
    void konversiR(){
        hasil = (4 * dataSuhu) / 5;
        System.out.println("Suhu dalam Reamur : " + hasil + "°R"); 
    }
    
    void konversiF(){
        hasil = (9 * dataSuhu) / 5 + 32;
        System.out.println("Suhu dalam Fahrenheit : " + hasil + "°F");
    }
    
    void konversiK(){
        hasil = dataSuhu + 273.15;
        System.out.println("Suhu dalam Kelvin : " + hasil + "K");
    }
    
    void kondisiAir(){
        if(dataSuhu <= 0){
            System.out.println("Kondisi air beku.");
        }
        else if(dataSuhu >= 100){
            System.out.println("Kondisi air mendidih.");
        }
        else{
            System.out.println("Kondisi air normal.");
        }
    }
}
