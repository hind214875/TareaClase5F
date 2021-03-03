/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaClase5F;

import java.util.Random;

/**
 *
 * @author hind
 */
public class CuadradoMagico {

    //atributos
    private final int[][] matriz;

    public CuadradoMagico() {
        int aux = 0;
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                aux = r.nextInt(9 - 1 + 1) + 1;
                
            }
            
        }
            matriz = new int[aux][aux];
    }
    
  

}
