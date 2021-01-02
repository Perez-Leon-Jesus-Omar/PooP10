/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroV2;

/**
 * Esta es la clase cuenta la cual sirve para poder depositar o sacar dinero de la cuenta
 * @author jopl1
 */
public class CuentaV2 {
    private double saldo;
    /**
     * Se agreaga un constructor vacio 
     */

    public CuentaV2() {
        this.saldo = 0;
    }
    /**
     * 
     * @return Se crea el saldo 
     */

    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param monto EL monto depositado se guarda aqui 
     */   
      
    public void depositar(double monto){
        System.out.println("Depositando: $" + monto);
        saldo += monto;
        System.out.println("Nuevo saldo : $" + saldo);
    }
    /**
     * 
     * @param monto El monto a retirar se hace en esta funcion
     * @throws SaldoInsuficienteExceptionV2 Es una excepcion que funciona para retirar solo el monto disponible
     */
    
    public void retirar(double monto)throws SaldoInsuficienteExceptionV2{
        System.out.println("Retirando monto");
        if (saldo < monto)
            throw new SaldoInsuficienteExceptionV2();
        else {
            saldo -= monto;            
        }
        System.out.println("Nuevo saldo : $" + saldo);
    }
}
