/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1camilaperrazo;
import java.util.Scanner;
/**
 *
 * @author Camila Perrazo
 * Fecha: 08/11/2023
 */
public class P1CamilaPerrazo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();

        Cuadrado cuadrado = new Cuadrado(lado);

        double area = cuadrado.calcularArea();
        double perimetro = cuadrado.calcularPerimetro();

        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El permetro del cuadrado es: " + perimetro);
    }
    
}
