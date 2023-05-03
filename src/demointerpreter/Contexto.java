/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Contexto {
    
    private String expresion;
    private int valor;
    
    public Contexto(String expresion){
        this.expresion = expresion;
        
        JOptionPane.showMessageDialog(null, "La expresiona a evaluar es: "+ expresion);
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
