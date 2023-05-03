/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demointerpreter;

/**
 *
 * @author pc
 */
public abstract class Expresion {

    public void interpretar(Contexto contexto) {

        //Si no hay elementos que interpretar salimos
        if (contexto.getExpresion().length() == 0) {
            return;
        }

        //Se verifica si empieza por nueve
        if (contexto.getExpresion().toUpperCase().startsWith(Nueve())) {

            //agregamos el nueve por la posicion donde este 1, 10, 100
            contexto.setValor(contexto.getValor() + (9 * Factor()));


            //Se eliminan dos carateres IX, XC, CM
            contexto.setExpresion(contexto.getExpresion().substring(2));

        }
        
        //Se verifica si empieza con cuatro
        else if(contexto.getExpresion().toUpperCase().startsWith(Cuatro())){
            
            contexto.setValor(contexto.getValor() + (4 * Factor()));

            //Se eliminan dos carateres 
            contexto.setExpresion(contexto.getExpresion().substring(2));
        }
        
        //Se verifica si empieza con cinco
        else if(contexto.getExpresion().toUpperCase().startsWith(Cinco())){
            
            contexto.setValor(contexto.getValor() + (5 * Factor()));
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }
        
        //Se recorren las unidades encontradas I, X, C
        while(contexto.getExpresion().toUpperCase().startsWith(Unidad())){
            
            contexto.setValor(contexto.getValor() + (1 * Factor()));
            contexto.setExpresion(contexto.getExpresion().substring(1));
        }
    }

    // Metodos abstractos para encontrar el caracter y factor segun la posicion
    public abstract String Unidad();

    public abstract String Cuatro();

    public abstract String Cinco();

    public abstract String Nueve();

    public abstract int Factor();
}
