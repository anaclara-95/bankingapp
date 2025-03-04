package com.springboot.bankingapp.utils;

import java.time.Year;

public class AccountUtils {

    /** el número de cuenta se selecciona de manera aleatoria concatenando el año actual y 6 dígitos random
      2025 + randomSixDigits

     el número random de 6 dígitos va a estar entre 100000 y 999999 (sin tomar esos dos valores)
     */

    //ontener el valor del año actual
    Year currentYear = Year.now();
    int min = 100000;
    int max = 999999;

    //generar un número aleatorio antre el mínimo y el máximo
    // el método random crea un número aleatorio entre 0 y 9

    //(int) convierte el valor de double a integer (casting)
    int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

    //convertir el valor de currentYear y randomNumber a string para poder concatenarlos

    String year = String.valueOf(currentYear);

}
