/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

/**
 *
 * @author pc
 */
public class ExpresionDecenas extends Expresion {
    
    @Override
    public String Unidad() {
        return "X";
    }
    
    @Override
    public String Cuatro(){
        return "XL";
    }
    
    @Override
    public String Cinco(){
        return "L"; 
    }
    
    @Override
    public String Nueve(){
        return "XC";
    }
    
    @Override
    public int Factor(){
        return 10;
    }
}
