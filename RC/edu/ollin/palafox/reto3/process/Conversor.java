package edu.ollin.palafox.reto3.process;

public class Conversor {
    /**
     * public static String binario
     *@param decimal es la variable qie contiene el numero a convertir
     *@return es la representacion binario del decimal
     */
    public static String binario(int decimal) {
        String binario = "";
        while (decimal > 0) {
            binario = (decimal % 2) + binario;
            decimal = decimal / 2;
        }
        return binario;
    }
    /**
     * public static String octal
     *@param decimal es la variable qie contiene el numero a convertir
     *@return es la representacion octal del decimal
     */
    public static String octal(int decimal) {
        String octal = "";
        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal = decimal / 8;
        }
        return octal;
    }
    /**
     * public static String binariodecimal
     *@param binario es la variable qie contiene el numero a convertir
     *@return es la representacion decimal del binario
     */
    public static int binariodecimal(String binario) {
        int decimal = 0;
        int binarioLength = binario.length();
        for (int i = 0; i < binarioLength; i++) {
            decimal += (binario.charAt(i) - '0') * Math.pow(2, binarioLength - i - 1);
        }
        return decimal;
    }
    /**
     * public static String binario
     *@param octal es la variable qie contiene el numero a convertir
     *@return es la representacion decimal del octal
     */
    public static int octalDecimal(String octal) {
        int decimal = 0;
        int octalLength = octal.length();
        for (int i = 0; i < octalLength; i++) {
            decimal += (octal.charAt(i) - '0') * Math.pow(8, octalLength - i - 1);
        }
        return decimal;
    }
    /**
     * public static String binario
     *@param hexadecimal es la variable qie contiene el numero a convertir
     *@return es la representacion decimal del hexadecimal
     */
    public static int hexadecimalDecimal(String hexadecimal) {
        int decimal = 0;
        int hexadecimalLength = hexadecimal.length();
        for (int i = 0; i < hexadecimalLength; i++) {
            char ch = hexadecimal.charAt(i);
            int digit = 0;
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                digit = 10 + ch - 'A';
            } else if (ch >= 'a' && ch <= 'f') {
                digit = 10 + ch - 'a';
            }
            decimal += digit * Math.pow(16, hexadecimalLength - i - 1);
        }
        return decimal;
    }
}
