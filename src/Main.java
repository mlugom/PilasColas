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
        
        do{
        int n= sc.nextInt();
        Cola<String> cola = new Cola<>();
        for (int i = 0; i < n; i++) {
            cola.add(sc.next());
        }
        
        int m = sc.nextInt();
        
        int nums[] = new int[m];
        Stack<String> pila[] = new Stack[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
            pila[i] = new Stack<>();
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < nums[i]; j++) {
                pila[i].add(cola.poll().toString());
            }
            System.out.println(pila[i]);
        }
        System.out.println("Escriba un caracter y presione ENTER para reiniciar.");
        sc.next();
        limpiarPantalla();
      
       
    
        
        }while(true);
    }
}
