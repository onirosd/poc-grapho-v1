package net.csonic.customers.graphql.utils;

public class DateUtils {

    public static String addHyphensToDateString(String dateString) {
        if (dateString != null && dateString.length() == 8) {
            return dateString.substring(0, 4) + "-" + dateString.substring(4, 6) + "-" + dateString.substring(6, 8);
        }
        return dateString;  // Retornar la cadena original si no cumple con el formato esperado
    }
}