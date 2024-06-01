/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author josem
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Solicitar los datos al usuario
        String nombre = JOptionPane.showInputDialog(null, "Digite el nombre:");
        int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite los años de antigüedad:"));
        int horasPorSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de horas laboradas por semana:"));
        double precioPorHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio que se le paga por hora:"));

        // Calcular el salario bruto
        double salarioBruto = horasPorSemana * precioPorHora * 4; // Asumiendo 4 semanas al mes

        // Calcular el bono si aplica
        if (antiguedad > 10) {
            salarioBruto *= 1.20; // Aplicar bono del 20%
        }

        // Realizar deducción si aplica
        if (salarioBruto > 2000) {
            salarioBruto *= 0.85; // Deducción del 15%
        } else if (salarioBruto > 1000) {
            salarioBruto *= 0.90; // Deducción del 10%
        }

        // Mostrar el salario neto al usuario
        JOptionPane.showMessageDialog(null, "El empleado " + nombre + " tiene un salario neto de $" + salarioBruto);
    }
}

    
    

