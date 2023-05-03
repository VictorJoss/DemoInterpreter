/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

/**
 *
 * @author pc
 */
public class ExpresionUnidad extends Expresion {

    
    @Override
    public String Unidad() {
        return "I";
    }
    
    @Override
    public String Cuatro(){
        return "IV";
    }
    
    @Override
    public String Cinco(){
        return "V"; 
    }
    
    @Override
    public String Nueve(){
        return "IX";
    }
    
    @Override
    public int Factor(){
        return 1;
    }

}
