package com.springboot.bankingapp.utils;

import java.time.Year;

public class AccountUtils {
    public static final String ACCOUNT_EXISTS_CODE = "001";

    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account";

    public static final String ACCOUNT_CREATION_SUCCESS = "002";

    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created";

    public static final String ACCOUNT_NOT_EXIST_CODE = "003";

    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "The user with the provided account number does not exist";

    public static final String ACCOUNT_FOUND_CODE = "004";

    public static final String ACCOUNT_FOUND_SUCCESS = "User account found";

    public static final String ACCOUNT_CREDITED_SUCCESS = "005";

    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User account credited";

    public static final String INSUFFICIENT_BALANCE_CODE = "006";

    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient balance";

    public static final String ACCOUNT_DEBITED_SUCCESS = "007";

    public static final String ACCOUNT_DEBITED_MESSAGE = "Account has been successfully debited";


    public static String generateAccountNumber() {
        /** el número de cuenta se selecciona de manera aleatoria concatenando el año actual y 6 dígitos random
         2025 + randomSixDigits

         el número random de 6 dígitos va a estar entre 100000 y 999999 (sin tomar esos dos valores)
         */

        //obtener el valor del año actual
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generar un número aleatorio antre el mínimo y el máximo
        // el método random crea un número aleatorio entre 0 y 9

        //(int) convierte el valor de double a integer (casting)
        int randNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

        /** con esto el algoritmo va a asumir que el número de cuenta va a tener 10 dígitos
         y nunca va a cambiar **/


        //convertir el valor de currentYear y randomNumber a string para poder concatenarlos

        String year = String.valueOf(currentYear);

        String randomNumber = String.valueOf(randNumber);

        StringBuilder accountNumber = new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
