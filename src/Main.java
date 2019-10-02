/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mlugom
 */

import java.awt.Robot;
import java.util.*;
public class Main {
    public static void limpiarPantalla() {
        try {
            Robot robbie = new Robot();
            robbie.keyPress(17);
            robbie.keyPress(76);
            robbie.keyRelease(17);
            robbie.keyRelease(76);

            Thread.sleep(100);

            robbie.keyPress(17);
            robbie.keyPress(16);
            robbie.keyPress(82);
            robbie.keyRelease(17);
            robbie.keyRelease(16);
            robbie.keyRelease(82);
            Thread.sleep(100);
        } catch (Exception ex) {
        }

    }
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        do{
        int n= sc.nextInt(); //Número de productos
        Cola<String> cola = new Cola<>();
        for (int i = 0; i < n; i++) {
            cola.add(sc.next()); //Cada uno de los n productos
        }
        
        int m = sc.nextInt(); //Número de tiendas
        
        int nums[] = new int[m];
        Pila<String> pila[] = new Pila[m];
        Pila<String> pilaInv[] = new Pila[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
            pila[i] = new Pila<>();
            pilaInv[i] = new Pila<>();
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nums[i]; j++) {
                pila[i].add(cola.poll());
            }
            for (int j = 0; j < nums[i]; j++) {
                pilaInv[i].add(pila[i].poll());
            }
            System.out.println(pilaInv[i].toString());
        }
        System.out.println("Escriba un caracter y presione ENTER para reiniciar. Escriba *salir* si así lo desea.");
        String respuesta = sc.next();
        if(respuesta.equals("salir"))
            seguir = false;
            
        limpiarPantalla();
      
       
    
        
        }while(seguir);
    }
}
