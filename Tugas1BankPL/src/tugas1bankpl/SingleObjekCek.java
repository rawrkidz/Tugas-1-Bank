/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1bankpl;

/**
 *
 * @author ASUS
 */
public class SingleObjekCek {
    private static SingleObjekCek instance = new SingleObjekCek();
    
    SingleObjekCek(){}
    
    public static SingleObjekCek getInstance(){
        return instance;  
    }
    
    public void showSaldo(int Tunai){
        System.out.println("Saldo Anda : Rp " + Tunai);    
    }
}   
