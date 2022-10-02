/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1bankpl;

import java.util.Scanner;

/**
 *
 * @author ASUS 
 */
public class Tugas1BankPL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Tunai = 500000;  
        int minimal = 100000;  
        for(String b = "y"; b.equals("y") || b.equals("Y");){
        
        System.out.println("Tugas 1 - Pemrograman Lanjut"); 
        System.out.println("");  
        System.out.println("1. Mario Indra Widjaja Hindarto - 672020013");
        System.out.println("2. Timothy Arif Kurniawan - 672020104"); 
        System.out.println("");  
        System.out.println("=================");
        System.out.println("Menu Bank MariTim");
        System.out.println("=================");
        System.out.println(""); 
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Saldo");
        System.out.println("3. Setor Saldo");
        System.out.println("4. Keluar");
        System.out.println(""); 
        Scanner a = new Scanner (System.in );
        System.out.print("Masukkan Menu : ");  
        int menu1 = a.nextInt();
        System.out.println("");   
            
        if(menu1 == 1){    
        SingleObjekCek object = SingleObjekCek.getInstance();
        object.showSaldo(Tunai); 
        Scanner s = new Scanner (System.in );
        System.out.print("Lanjut (Y/N) : "); 
        b = s.next();   
    }
        else if(menu1 == 2){
        Scanner money = new Scanner (System.in);
        System.out.print("Masukkan Uang yang Ingin Ditarik : ");
        int c = money.nextInt();  
            
        if(Tunai > minimal ){   
            
            if(Tunai > c){
            
            if (c %50000 == 0){
            System.out.println("Uang Yang Anda Tarik : " + c);
            Tunai = Tunai - c;
            System.out.println("Sukses Tarik Uang");  
            }
            else { 
            GagalFactory gagalFactory = new GagalFactory();
        
            Fail fail1 = gagalFactory.getFail("GAGAL1");
            fail1.ggl();  
             }          
        }
   
        else {   
            GagalFactory gagalFactory = new GagalFactory();
        
            Fail fail3 = gagalFactory.getFail("GAGAL3");
            fail3.ggl();        
        } 
    }
        else {
            GagalFactory gagalFactory = new GagalFactory();
        
            Fail fail1 = gagalFactory.getFail("GAGAL1");
            fail1.ggl(); 
        }   

        Tunai model = retrieveTunaiFromDataBase();
        
        TunaiView view = new TunaiView();
        
        TunaiControl control = new TunaiControl(model, view);
        
        control.setTunai(Tunai);
        
        control.updateView(); 
         
        Scanner s = new Scanner (System.in );
        System.out.print("Lanjut (Y/N) : "); 
        b = s.next();   
    }
        else if (menu1 == 3){
        Scanner money = new Scanner (System.in);
            System.out.print("Masukkan Uang yang Ingin Disetor : ");
            int c = money.nextInt();
            
            if(c %50000 == 0){
            System.out.println("Uang Yang Anda Setor : " + c);
            Tunai = Tunai + c;
            System.out.println("Sukses Setor Uang"); 
            } 
            else {
                GagalFactory gagalFactory = new GagalFactory();
        
                Fail fail2 = gagalFactory.getFail("GAGAL2");
                fail2.ggl();              
            }
            
        Tunai model = retrieveTunaiFromDataBase();
        
        TunaiView view = new TunaiView();
        
        TunaiControl control = new TunaiControl(model, view);
        
        control.setTunai(Tunai);
        
        control.updateView();
        Scanner s = new Scanner (System.in );
        System.out.print("Lanjut (Y/N) : "); 
        b = s.next(); 
    }  
        else if (menu1 == 4){
            System.out.println("Sampai Jumpa Dan Terima Kasih"); 
            break;    
        }
        else {
            System.out.println("Menu Tidak Tersedia"); 
            Scanner s = new Scanner (System.in );
            System.out.print("Lanjut (Y/N) : ");  
            b = s.next();  
        }
    }        
}
    private static Tunai retrieveTunaiFromDataBase() {
        Tunai tunai = new Tunai();
        tunai.setTunai(0);
        return tunai;
    }
}   

    
                                