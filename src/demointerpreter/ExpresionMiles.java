/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

/**
 *
 * @author pc
 */
public class ExpresionMiles extends Expresion{
    
    @Override
    public String Unidad() {
        return "M";
    }
    
    @Override
    public String Cuatro(){
        return " ";
    }
    
    @Override
    public String Cinco(){
        return " "; 
    }
    
    @Override
    public String Nueve(){
        return " ";
    }
    
    @Override
    public int Factor(){
        return 1000;
    }
    
}
