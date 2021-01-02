/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop10;

/**
 *
 * @author jopl1
 */
public class PooP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*********** Act 1 *********");
        try{
            String mensajes [] = {"Pato", "Ardilla", "Melocoton"};
            for (int i = 0; i < 4; i++){
            System.out.println(mensajes[i]);
            }
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Apuntador fuera de rango");
        }
        
        
        System.out.println("\n*********** Act 2 *********");
        ///Finally
        try{
            float equis = 5/0;
            System.out.println("Equis = " + equis);
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Apuntador fuera de rango");
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
        //ArithmeticException ae = Lo que lance la excepcion
        
        System.out.println("\n*********** Act 3 *********");
        ///Catch anidado        
        try{
            float equis = 5/0;
            System.out.println("Equis = " + equis);
        }catch(ArithmeticException ae){
            System.out.println("Error: division entre cero");
        }catch(Exception e){
            System.out.println("Excepcion general");
        }finally{
            System.out.println("A pesar de todo se ejecuta finally");
        }
        System.out.println("Fuera de try-catch");
        
               
        System.out.println("\n*********** Act 4 *********");
        ///Propgacion de excepciones
        
        try {
            int division = division(8,0);
            System.out.println("Division = " + division);
        } catch (ArithmeticException e){
            System.out.println("Excepcion aritmetica");
            //e.printStackTrace();
        }
        /*
        int division = division(8,0);
        System.out.println("Division = " + division);*/
        
        System.out.println("\n*********** Act 5 *********");
        ///Throw
        
        try {
            int division = division2(8,0);
            System.out.println("Division = " + division);
        } catch (ArithmeticException e){
            System.out.println("Excepcion aritmetica");
            //e.printStackTrace();
        }
        ///Para reporte: Que todo sea pedido por teclado
    }
    
    public static int division(int a, int b)throws ArithmeticException{
        int c;
        /*try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("Excepcion aritmetica");
            c = 0;
        }*/
        c = a/b;
        return c;
    }
    
    public static int division2(int a, int b)throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();
        }int c = a/b;
        
        return c;
    } 
    
    
}
