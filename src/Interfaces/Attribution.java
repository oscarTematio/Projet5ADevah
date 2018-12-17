/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Classes.ParametresTest;
/**
 *
 * @author Oscar Teamatio
 */

public class Attribution  extends Save{
     ParametresTest param = new ParametresTest();
    public void Action(){
        if(RFTCheck.isSelected()){
            param.setNature("RFT");
        }else if (VVSCheck.isSelected()){
            param.setNature("VVS");
        }else if (AxeCheck.isSelected()){
            param.setNature("AXE-Z");
        }
        
        param.setVitesse(Double.parseDouble(Vitesse.getText()));
        param.setValeursCadre(Cadre);
        param.setValeursTige(Tige);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
     
    }
     
     
}
