/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1bankpl;

/**
 *
 * @author ASUS
 */
public class TunaiControl {
    private Tunai model;
    private TunaiView view;

    public TunaiControl(Tunai model, TunaiView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setTunai(int Tunai){
        model.setTunai(Tunai);
    }
    
    public int getTunai(){
        return model.getTunai(); 
    } 
      
    public void updateView(){
        view.printTunaiDetails(model.getTunai());
    }  
}
