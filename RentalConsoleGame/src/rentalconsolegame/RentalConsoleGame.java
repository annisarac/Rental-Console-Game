/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author news
 */
public class RentalConsoleGame extends Member{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Silver s = new Silver();
        Gold g = new Gold();
        Platinum p = new Platinum();
        
        namaMember();
        
        String idMember;
        int tglSewa;
        int blnSewa;
        int thnSewa;
        int tglReturn;
        int blnReturn;
        int thnReturn;
        Scanner input = new Scanner(System.in);
        
        System.out.println("------------------ Pengembalian Console Game ------------------");
        System.out.println("Masukan ID Member                   : " );
        idMember = input.nextLine();
        
        System.out.println("Masukan Tanggal Pinjam (1-31)      : " );
        tglSewa = input.nextInt();
        
        System.out.println("Masukan Bulan Pinjam (1-12)         : " );
        blnSewa = input.nextInt();
        
        System.out.println("Masukan Tahun Pinjam (xxxx)         : " );
        thnSewa = input.nextInt();
        
        System.out.println("Masukan Tanggal Kembali (1-31)      : " );
        tglReturn = input.nextInt();
        
        System.out.println("Masukan Bulan Kembali (1-12)        : " );
        blnReturn = input.nextInt();
        
        System.out.println("Masukan Tahun Kembali (xxxx)        : " );
        thnReturn = input.nextInt();
        
        System.out.println("----------------------------------------------------------------");
        cariMember(idMember);
        
        System.out.println("----------------------------------------------------------------");
        System.out.println("Tanggal Pinjem                      : " + tglSewa + "-" + blnSewa + "-" + thnSewa);
        System.out.println("Tanggal Kembali                     : " + tglReturn + "-" + blnReturn + "-" + thnReturn);
        
        int durasiSewa = sewaDurasi(tglSewa, blnSewa, thnSewa, tglReturn, blnReturn, thnReturn);
        System.out.println("Lama Sewa                           : " + durasiSewa + " Hari");
        
        String layananMember = jenisMember(idMember);
        if(layananMember == "Silver"){
            System.out.println("Total Sewa                      : Rp" + s.bonusDiskon(durasiSewa));
            System.out.println("Jumlah Poin                     : " + s.totalPoin(durasiSewa));
        } else if(layananMember == "Gold"){
            System.out.println("Total Sewa                      : Rp" + g.bonusDiskon(durasiSewa));
            System.out.println("Jumlah Poin                     : " + g.totalPoin(durasiSewa));
            System.out.println("Jumlah Cashback                 : Rp" + g.cashback);
        }else {
            System.out.println("Total Sewa                      : Rp" + p.bonusDiskon(durasiSewa));
            System.out.println("Jumlah Poin                     : " + p.totalPoin(durasiSewa));
            System.out.println("Jumlah Cashback                 : Rp" + p.cashback);
            System.out.println("Bonus Pulsa                     : Rp" + p.bonusSewa(durasiSewa));
        }
    }
    
}
