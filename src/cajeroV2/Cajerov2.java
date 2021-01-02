/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroV2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase cajero, donde se controla el saldo de una cuenta
 * @author jopl1
 */
public class Cajerov2 {
    public static void main(String[] args){
        KeyboardInputCajero input = new KeyboardInputCajero();
        CuentaV2 cuenta = new CuentaV2();
        try {
            System.out.println("[1] Retirar dinero  \n[2] Depositar dinero ");
            int a = input.readInteger();
            
            switch (a){
                case 1:
                    System.out.println("Ingrese cantidad a retirar:");
                    float b = input.readFloat();
                    cuenta.retirar(b); 
                break;
                
                case 2:
                    System.out.println("Ingrese cantidad a depositar:");
                    float c = input.readFloat();
                    cuenta.depositar(c);
                break;
                    
                default:
                    System.out.println("Numero no valido");
                break;
                
            }
            
            
        } catch (SaldoInsuficienteExceptionV2 ex) {
            System.out.println("Saldo insuficiente");
        }
    }
}
