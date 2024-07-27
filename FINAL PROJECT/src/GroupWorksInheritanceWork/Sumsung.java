/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupWorksInheritanceWork;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/*@author ~Group
 * Roggers Anguzu 667137
 * Lina Mukashumbusho 667159
 * Jacob Aluvanze 666305
 * Salim Mwatsefu 668327*/
public class Sumsung extends Iphone {

    private String storage;
     
    public Sumsung(String name, String model, String color, int price, String CameraType,String storage){
        super(name,model,color,price,CameraType);
        this.storage=storage;
    }
    public String getStorage(){
        return storage;
    }
    public void SUMSUNG(){
        String storage = JOptionPane.showInputDialog(null,"Enter the Phone Storage");
        TextArea place= new TextArea(10,10);
        place.append("The Phone Specifications are: \n"+name+"\n"+ model +"\n"+ "\n"+color +"\n");
        place.append("This Phone is Accounted: " + price);
        place.append("This Phone Has a Storage of: " + storage);
        JOptionPane.showMessageDialog(null, place);
         
    }
}
