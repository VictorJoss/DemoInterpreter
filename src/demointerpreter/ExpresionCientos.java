/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

/**
 *
 * @author pc
 */
public class ExpresionCientos extends Expresion{
    
    @Override
    public String Unidad() {
        return "C";
    }
    
    @Override
    public String Cuatro(){
        return "CD";
    }
    
    @Override
    public String Cinco(){
        return "D"; 
    }
    
    @Override
    public String Nueve(){
        return "CM";
    }
    
    @Override
    public int Factor(){
        return 100;
    }
    
}
