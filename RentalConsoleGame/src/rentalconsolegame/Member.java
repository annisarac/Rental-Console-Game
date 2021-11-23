/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author news
 */
public class Member {
    static Map<String, List<String>> dataMember = new HashMap<String, List<String>>();
    static int waktuSewa;
    
    static void namaMember(){
        
        //Member M001
        List<String> Member1 = new ArrayList<String>();
        Member1.add("Mr. X");
        Member1.add("Silver");
        
        //Member M002
        List<String> Member2 = new ArrayList<String>();
        Member2.add("Mr. Y");
        Member2.add("Gold");
        
        //Member M003
        List<String> Member3 = new ArrayList<String>();
        Member3.add("Mr. Z");
        Member3.add("Platinum");
        
        //semua member
        dataMember.put("M001", Member1);
        dataMember.put("M002", Member2);
        dataMember.put("M003", Member3);
    }
    
    static void cariMember (String idMember){
        if(dataMember.containsKey(idMember)){
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()){
                if(entry.getKey().equals(idMember)){
                    String key = entry.getKey();
                    List<String> jumlah = entry.getValue();
                    System.out.println("ID Member           : " + key);
                    System.out.println("Nama Member         : " + jumlah.get(0));
                    System.out.println("Jenis Member        : " + jumlah.get(1));
                }
            }
        }else {
            System.out.println("Belum terdaftar Member");
        }
    }
    
    static String jenisMember(String idMember){
        String layananMember = null;
        if(dataMember.containsKey(idMember)){
            for(Map.Entry<String, List<String>> entry : dataMember.entrySet()){
                if(entry.getKey().equals(idMember)){
                    List<String> jumlah = entry.getValue();
                    layananMember = jumlah.get(1);
                }
            }
        }
        return layananMember;
    }
    
    static int sewaDurasi(int tglSewa, int blnSewa, int thnSewa, int tglReturn, int blnReturn, int thnReturn){
        if(thnReturn >= thnSewa){
            if(blnReturn >= blnSewa){
                LocalDateTime sewa = LocalDateTime.of(thnSewa, blnSewa, tglSewa, 23, 59,59);
                LocalDateTime kembali = LocalDateTime.of(thnReturn, blnReturn, tglReturn, 23, 59, 59);
                Duration durasi = Duration.between(sewa, kembali);
                waktuSewa = (int) durasi.toDays();
            }else{
                System.out.println("Tanggal kembali salah, silahkan ulangi");
            }
        }else {
            System.out.println("Tanggal kembali salah, silahkan ulangi");
        }
        return waktuSewa;
    }
}
