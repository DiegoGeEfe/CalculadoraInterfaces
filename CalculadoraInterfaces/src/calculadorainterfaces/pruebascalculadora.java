/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorainterfaces;

/**
 *
 * @author diegogf
 */
public class pruebascalculadora {

    public static void main(String[] args) {
        String operacion = "1+2*20/10";
        int resultado = 0;

//        String a = operacion.substring(2, 3);
//        System.out.println(a);
        String cadena = "", cadena1 = "";
        for (int i = operacion.indexOf("/")-1; i >= 0; i--) {
            if (operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' || operacion.charAt(i) == '/') {
                cadena = operacion.substring(i+1, operacion.indexOf("/"));
                System.out.println(cadena);
                break;
            }
        }
        cadena1 = operacion.substring(operacion.indexOf("/")+1);
        for (int i = operacion.indexOf("/")+1; i < operacion.length(); i++) {
            if(operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' || operacion.charAt(i) == '/'){
                cadena1 = operacion.substring(operacion.indexOf("/"), i);
                System.out.println(cadena1);
                break;
            }
            if(i==operacion.length()-1){
                cadena1 = operacion.substring(operacion.indexOf("/")+1, operacion.length());
                System.out.println(cadena1);
            }
        }
        System.out.println(Double.parseDouble(cadena)/Double.parseDouble(cadena1));
//        for (int i = 0; i < operacion.length(); i++) {
//
//            if(operacion.charAt(i)=='*'){
//                int num1 = Integer.parseInt(operacion.substring(i-1, i)), 
//                        num2 = Integer.parseInt(operacion.substring(i+1, i+2));
//                resultado = num1*num2;
//                
//                operacion = operacion.substring(0, i-1)+resultado;
//            }
//        }
//        for (int i = 0; i < operacion.length(); i++) {
//            if(operacion.charAt(i)=='+'){
//                int num1 = Integer.parseInt(operacion.substring(i-1, i)), 
//                        num2 = Integer.parseInt(operacion.substring(i+1, i+2));
//                resultado = num1+num2;
//            }
//        }

        System.out.println(resultado);
    }

    private static int principiodelnumero(String operacion) {
        String cadena = operacion.substring(0, operacion.indexOf("*"));

        if (cadena.contains("+") || cadena.contains("-") || cadena.contains("/") || cadena.contains("*")) {
            for (int i = operacion.indexOf("*"); i <= 0; i--) {
                if (operacion.charAt(i) == '+' || operacion.charAt(i) == '-' || operacion.charAt(i) == '*' || operacion.charAt(i) == '/') {
                    cadena = operacion.substring(i, operacion.indexOf("*"));
                }
            }
            return 2;
        } else {
            return 2;
        }
    }
}
