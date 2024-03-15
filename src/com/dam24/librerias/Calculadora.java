package com.dam24.librerias;

/**
 * Libreria que contiene las 4 operaciones básicas.
 * Suma, resta, división y multiplicación.
 * @version 1.0
 * @author Pablo Iglesias
 */
public class Calculadora {
    final static int SUMA=1;
    final static int RESTA=2;
    final static int MULTIPLICACION=3;
    final static int DIVISION=4;
    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param num1   primer valor para realizar la operación
     * @param num2   segundo valor para realizar la operación
     * @param opcion para escoger que operación se va realizar
     * @return el resultado, o null en caso de error
     */
    public static Float operaciones(float num1, float num2, int opcion) {
        Float resultado;
        switch (opcion) {
            case SUMA:
                resultado = num1 + num2;
                break;
            case RESTA:
                resultado = num1 - num2;
                break;
            case MULTIPLICACION:
                resultado = num1 * num2;
                break;
            case DIVISION:
                try{
                    resultado = num1 / num2;
                } catch (ArithmeticException E){
                    resultado=null;
                } break;
            default:
                resultado=null;
                break;
        }
        return resultado;
    }
}
