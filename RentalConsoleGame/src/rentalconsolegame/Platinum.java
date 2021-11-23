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
public class Platinum extends Gold{
    //atribut
    int bonus;
    
    //constructor
    Platinum(){
        biayaSewa = 45000;
        diskon = 3;
        poin = 10;
        cashback = 10000;
    }
    
    int bonusSewa(int durasiSewa){
        bonus = durasiSewa * 5000;
        
        return bonus;
    }
}
