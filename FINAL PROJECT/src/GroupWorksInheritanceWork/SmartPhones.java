/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GroupWorksInheritanceWork;
/*
@author ~Group
 * Roggers Anguzu 667137
 * Lina Mukashumbusho 667159
 * Jacob Aluvanze 666305
 * Salim Mwatsefu 668327*/

import java.awt.TextArea;
import javax.swing.JOptionPane;

public class SmartPhones {
    public String name;
    public String model;
    public Integer price;
    public String color;

    public SmartPhones(String name, String model, String color, Integer price){
        this.name=name;
        this.model=model;
        this.price=price;
        this.color=color;
    }

    public String getname(){
        return name;
    }

    public String getmodel(){
        return model;
    }

    public Integer getprice(){
        return price;
    }
    public String color(){
        return color;
    }

   
    public void Specifications(){
        
        TextArea place= new TextArea(5,5);
        place.append("The Phone Specifications are: \n"+name+"\n"+ model +"\n"+ "\n"+color );
        place.append("\nThis Phone is Accounted: \n" + price);
        JOptionPane.showMessageDialog(null, place);
        
    }
 

   public static void main(String[] args){
        TextArea place= new TextArea(5,5);
    
        String name = JOptionPane.showInputDialog(null,"Enter the Phone Name: ");
        String model = JOptionPane.showInputDialog(null,"Enter Its Model: ");
        String color = JOptionPane.showInputDialog(null,"Enter the Phone Color");
        String x = JOptionPane.showInputDialog(null, "Enter the Phone Price: ");
        String camera = JOptionPane.showInputDialog(null,"Enter the Phone Camera: ");
        int price = Integer.parseInt(x);
        
       //hobgougougoiufgifyufoyfuofouy
        
        if(name.equalsIgnoreCase("iphone")){
             Iphone one=new Iphone(name,model,color,price,camera);
             one.IPHONE();
        }else{
             String storage = JOptionPane.showInputDialog(null,"Enter the Phone Storage: ");
             place.append("The Phone Storage is" +storage);
             Sumsung one=new Sumsung(name,model,color,price,camera,storage);
             one.SUMSUNG();
        }       
    }
}