/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1bankpl;

/**
 *
 * @author ASUS
 */
public class GagalFactory {
    public Fail getFail(String failType){
        if (failType == null)
            return null;  
        
        if (failType.equalsIgnoreCase("GAGAL1")) 
        {
            return new Gagal1Factory();
        }
        
        else if (failType.equalsIgnoreCase("GAGAL2")) 
        {
            return new Gagal2Factory();
        }
        
        else if (failType.equalsIgnoreCase("GAGAL3"))  
        {
            return new Gagal3Factory();    
        }
        
        return null;    
    }
} 
