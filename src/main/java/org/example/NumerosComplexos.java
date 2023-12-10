package org.example;

public class NumerosComplexos {
    public static  int[] valuesArray = new int[4];
    public static  int index =0;

    public static void obterNumeros(String x) {
        for(int i =0; i < x.length(); i++) {
            try{
                char result = x.charAt(i);
                int valueResult = Integer.parseInt(String.valueOf(result));
                valuesArray[index] = valueResult;
                index++;
            }catch(Exception e) {
                continue;
            }
        }
    }
    public static String Soma() {
        int a = valuesArray[0] + valuesArray[2];
        int b = valuesArray[1] + valuesArray[3];

        return a + "+" +b+"i";
    }
    public static String Subtrair() {
        int a = valuesArray[0] - valuesArray[2];
        int b = valuesArray[1] - valuesArray[3];

        return a + "+" +b+"i";
    }

    public static String Modulo() {

        int a = (int) (Math.pow(valuesArray[0],2) + Math.pow(valuesArray[1],2));
        int b = (int) (Math.pow(valuesArray[2],2) + Math.pow(valuesArray[3],2));

        return "√"+a+", √"+b;
    }

}
