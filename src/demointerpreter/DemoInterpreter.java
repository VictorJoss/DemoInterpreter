/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demointerpreter;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class DemoInterpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String expresionEvaluar = JOptionPane.showInputDialog(null, "Ingrese un numero romano");

Contexto contexto = new Contexto(expresionEvaluar);

// Se construye el árbol de parseo
// Cada clase corresponde a una regla en la gramática
ArrayList<Expresion> arbol = new ArrayList<Expresion>();
arbol.add(new ExpresionMiles());
arbol.add(new ExpresionCientos());
arbol.add(new ExpresionDecenas());
arbol.add(new ExpresionUnidad());

// Interpretamos siguiendo las reglas gramaticales
// que están en el árbol
for (Expresion exp : arbol) {
    exp.interpretar(contexto);
}

        JOptionPane.showMessageDialog(null,"La expresion "+expresionEvaluar+" es igual a "+contexto.getValor());

    }
    
}
