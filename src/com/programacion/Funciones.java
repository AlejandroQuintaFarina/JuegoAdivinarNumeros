package com.programacion;

public class Funciones {



    public static boolean generarAleatorio(Tablero auxTablero){
        auxTablero.setcifraAleatoria("5432");
        return true;
    }
    public static String pedirSecuencia (Tablero cifraSecuencia)
    {cifraSecuencia.setCifraSecuencia("2345");
        return null;}

    public static boolean comprobarSecuencia (String cifraAleatoria, String cifraSecuencia) {

        //comparar
        cifraAleatoria.equals(cifraSecuencia);
        return false;
    }
    public static void mostrar (String mensaje) {

    }
    public static String mostrarPista (String cifraPista){
        
        return cifraPista;
    }




}
