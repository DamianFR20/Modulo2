/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

public class Principal {

    public static void main(String[] args) {
        
        Recursos recursos = new Recursos(); 

        System.out.println("Resultado del metodo numero uno: " + recursos.Mensaje());

        int edadEstudiante = 22; 
        System.out.println("Resultado del metodo numero dos: " + recursos.Edad(edadEstudiante));

        int num1 = 12;
        int num2 = 3;
        System.out.println("Resultado del metodo numero tres: " + recursos.Multiplicacion(num1, num2));
        
        int x = 13;
        System.out.println("Resultado del cuarto metodo:");
        System.out.println(recursos.NumeroX(x));
       
        
    }
}


