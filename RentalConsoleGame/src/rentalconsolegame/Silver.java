/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author news
 */
public class Silver extends Member {
    //atribut
    int biayaSewa;
    int diskon;
    int poin;
    int biayaSementara;
    int totalDiskon;
    int totalBiaya;
    
    //constructor
    Silver(){
        this.biayaSewa = 25000;
        this.diskon = 1;
        this.poin = 1;
    }
    
    int bonusDiskon(int durasiSewa){
        biayaSementara = durasiSewa * biayaSewa;
        totalDiskon = (biayaSementara * diskon)/100;
        totalBiaya = biayaSementara - totalDiskon;
        
        return totalBiaya;
    }
    
    int totalPoin (int durasiSewa){
        int jumlahPoin = durasiSewa * poin;
        return jumlahPoin;
    }
}
