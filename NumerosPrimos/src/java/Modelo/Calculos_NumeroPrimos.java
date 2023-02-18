
package Modelo;

public class Calculos_NumeroPrimos {
    
    //Atributos
    int contador;


    public Calculos_NumeroPrimos() {

    }

    public int calculoNumeroPrimo(int numero){
        contador = 0;
        for(int i = 1; i <= numero; i ++){
            if((numero % i) == 0){
                contador++;
            }
        }
        
        if(contador <= 2){
            return numero;
        }
        return 0;
    }

    
    
    
}
