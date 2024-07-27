/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupWorksInheritanceWork;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author ~CyberCodex
 * Roggers Anguzu 667137
 * Lina Mukashumbusho 667159
 * Jacob Aluvanze 666305
 * Salim Mwatsefu 668327
 */
public class Iphone extends SmartPhones{
    public String CameraType;
    
    public Iphone(String name, String model, String color, int price1, String CameraType){
        super(name,model,color,price1);
        this.CameraType=CameraType;
    }
    public String getCameraType(){
        return CameraType;
    }
    public void IPHONE(){
        String camera = JOptionPane.showInputDialog(null,"Enter the Phone Camera");
        TextArea place= new TextArea(5,5);
        place.append("The Phone Specifications are: \n"+name+"\n"+ model +"\n"+ "\n"+color +"\n");
        place.append("This Phone is Accounted: \n" + price);
        place.append("This Phone Has a Camera of: " + CameraType);
        JOptionPane.showMessageDialog(null, place);
         
    }
    
}
