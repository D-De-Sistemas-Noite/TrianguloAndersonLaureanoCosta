/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tri;

import java.util.Scanner;

/**
 *
 * @author A.L.C
 */
public class TrianguloAnderson {
    public static void main(String[] args) {
        //Declaração de variaveis
        int a,b,c;
        
        //Criação de instancia do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        
        //Apresentação do programa
        System.out.println("\n\t\t\t -- Triangulo --\n");
        
        System.out.println("Insira a primeira medida");
        a = entrada.nextInt();
        System.out.println("Insira a segunda medica");
        b = entrada.nextInt();
        System.out.println(" Insira a terceira medica");
        c = entrada.nextInt();
        if(a < (b + c) && b <(a + c) && c < (a + b)){
            //Garanto que formo o triangulo
            if (a == b && b == c){
                System.out.println("Triangulo equilatero");
            }
            else if ( a == b || b == c || a == c ) {
                System.out.println("Triangulo isosceles");
            }
            else{
                System.out.println("Triangulo escaleno");
                
            }
            
            
        }
        else {
            System.out.println("As medidas nao formam um triangulo");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
