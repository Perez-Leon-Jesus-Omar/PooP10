/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroV2;

/**
 * Clase que determina los errores al encontrar un saldo negativo
 * @author jopl1
 */
public class SaldoInsuficienteExceptionV2 extends Exception{
    SaldoInsuficienteExceptionV2(){
        super("Saldo insuficiente");
    }
    
}
