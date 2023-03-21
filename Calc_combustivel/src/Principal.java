
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculo_combustivel calc = new Calculo_combustivel();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade KM rodados: ");
        double Km = scan.nextDouble();
        calc.calcularLitros(Km);
        System.out.println("Digite o valor do litro do combutível: ");
        double valorComb = scan.nextDouble();
        calc.calcularTotalGasto(valorComb);
        
        
        
    }
    
}
