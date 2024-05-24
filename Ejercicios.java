package UF2;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import static UF2.Main.*;

public class Ejercicios {

    public static void comparaNum() {
        int num1;
        int num2;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce el primer numero: ");
            num1 = scan.nextInt();

            System.out.println("Introduce el segundo numero: ");
            num2 = scan.nextInt();


            if (num1 > num2) {
                System.out.println("El mayor de los dos es: " + num1);
            }
            if (num1 < num2) {
                System.out.println("El menor de los dos es: " + num1);
            }
            if (num2 > num1) {
                System.out.println("El mayor de los dos es: " + num2);
            }
            if (num2 < num1) {
                System.out.println("El menor de los dos es: " + num2);
            }
            if (num1 == num2) {
                System.out.println("Son iguales");
            } else if (num1 != num2) {
                System.out.println("Los numeros no son iguales.");
            }
        } while (num1 != 0 && num2 != 0);

        System.out.println("  -----Has introducido 0, se parara el programa... -----  ");
    }

    public static void Calculadora() {

        double num1;
        double num2;


        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce el primer numero: ");
            num1 = scan.nextDouble();

            System.out.println("Introduce el segundo numero: ");
            num2 = scan.nextDouble();

            double suma = num1 + num2;
            double resta = num1 - num2;
            double multiplicacion = num1 * num2;
            double division = num1 / num2;

            System.out.println("La suma de ambos numeros es : " + suma);
            System.out.println("La resta de ambos numeros es : " + resta);
            System.out.println("La multiplicacion de ambos numeros es : " + multiplicacion);
            System.out.println("La division de ambos numeros es : " + division);

        } while (num1 != 0 || num2 != 0);

        System.out.println("  -----Has introducido 0, se parara el programa... -----  ");
    }

    public static void contieneVocales() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = scan.nextLine();
        if (frase.contains("a")) {
            System.out.println("La frase contiene la letra a.");
        }
        if (frase.contains("e")) {
            System.out.println("La frase contiene la letra e.");
        }
        if (frase.contains("i")) {
            System.out.println("La frase contiene la letra i.");
        }
        if (frase.contains("o")) {
            System.out.println("La frase contiene la letra o.");
        }
        if (frase.contains("u")) {
            System.out.println("La frase contiene la letra u.");
        }
    }

    public static void adivinaNum() {
        Scanner scan = new Scanner(System.in);

        int num = (int) Math.floor(Math.random() * 10);
        int respuesta = -1;
        int intentos = 3;
        int puntuacion = 0;


        while (intentos > 0) {

            System.out.println("Introduce un numero del 0 al 9, te quedan " + intentos + " intentos. *Psst, el num es: " + num + " *");
            respuesta = scan.nextInt();

            if (respuesta == num) {
                System.out.println("Felicidades, has adivinado el numero.");
                break;
            } else {
                System.out.println("Incorrecto, sigue intentándolo");
                intentos--;
            }

        }

        /* con lambda se simplica mas la sintaxis */

        switch (intentos) {
            case 3 -> System.out.println("[PUNTUACION]: 10 puntos.");
            case 2 -> System.out.println("[PUNTUACION]: 5 puntos.");
            case 1 -> System.out.println("[PUNTUACION]: 3 puntos.");
            case 0 -> System.out.println("[PUNTUACION]: 0 puntos.");
        }
    }

    public static void imprimeixArray() {
        String[] talla = {"S", "M", "L", "X", "XL", "2XL", "3XL"};

        for (int i = 0; i <= talla.length - 1; i++) {
            System.out.println(talla[i]);
        }
    }

    public static void crearArray() {

        Scanner scan = new Scanner(System.in);
        double suma = 0;
        double[] array;

        System.out.println("Introduce el tamaño del array: ");
        int size = scan.nextInt();

        array = new double[size];

        for (double i = 0; i <= array.length - 1; i++) {
            array[(int) i] = Math.floor(Math.random() * 1000) / 100;
            suma += array[(int) i];
            System.out.println("La posicion " + (int) i + " contiene el valor: " + array[(int) i]);
        }
        System.out.println("La suma de todos los valores es: " + Math.floor(suma));
    }

    public static void introduceLength(int llargada) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el length de la contraseña: ");
        llargada = scan.nextInt();

        /*if (llargada >= 8) {
            obtenerCaracter((int) Math.floor(Math.random() * 3));
        }

        if (numero == 0) {
            return nums[(int) Math.floor(Math.random() * nums.length)];
        } else if (numero == 1) {
            return lletres[(int) Math.floor(Math.random() * lletres.length)];
        } else {
            return simbols[(int) Math.floor(Math.random() * simbols.length)];
        }*/

    }

    /*public static void tictacToe(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Elegir jugador:  X / O");
        String jugador= scan.nextLine();
        int[][] array;
        array = new int[3][3];

        switch(jugador){

            case "X":
                System.out.println("Has elegido X: ");
                System.out.println("Introduce FILA: (0-3)");
                int i = scan.nextInt();
                System.out.println("Introduce COLUMNA: (0-3)");
                int j = scan.nextInt();

                for(i=i; i<=2; i++){
                    array[i][0];
                    for(j=j; j<=2; j++){
                        array[i][j];
                    }
                }

        }
    }*/

    public static void battleShip() {

        Scanner scan = new Scanner(System.in);

        boolean[][] omplit = new boolean[3][4];
        int[][] array = new int[3][4];

        for (int i = (int) Math.floor(Math.random() * 3); i < array.length; i++) {
            for (int j = (int) Math.floor(Math.random() * 4); j < array[i].length; j++) {
                omplit[i][j] = true;
                System.out.println(omplit[i][j]);
            }
        }

    }

    public static void horarioClases() {

        Scanner scan = new Scanner(System.in);
        int day;

        System.out.println("Introduce que día quieres consultar: ");
        String dia = scan.nextLine();

        String[][] horario = new String[7][5];

        horario[0][0] = "Dilluns";
        horario[1][0] = "[15:00 - 15:55] M3";
        horario[2][0] = "[15:55 - 16:50] M3";
        horario[3][0] = "[17:10 - 18:95] M2";
        horario[4][0] = "[18:05 - 19:00] M2";
        horario[5][0] = "[19:15 - 20:10] M2";
        horario[6][0] = "[20:10 - 21:05] HORA LIBRE";

        horario[0][1] = "Dimarts";
        horario[1][1] = "[15:00 - 15:55] -";
        horario[2][1] = "[15:55 - 16:50] M1";
        horario[3][1] = "[17:10 - 18:95] M1";
        horario[4][1] = "[18:05 - 19:00] M5";
        horario[5][1] = "[19:15 - 20:10] M5";
        horario[6][1] = "[20:10 - 21:05] -";

        horario[0][2] = "Dimecres";
        horario[1][2] = "[15:00 - 15:55] M4";
        horario[2][2] = "[15:55 - 16:50] M4";
        horario[3][2] = "[17:10 - 18:95] M2";
        horario[4][2] = "[18:05 - 19:00] M2";
        horario[5][2] = "[19:15 - 20:10] FOL";
        horario[6][2] = "[20:10 - 21:05] FOL";

        horario[0][3] = "Dijous";
        horario[1][3] = "[15:00 - 15:55] M1";
        horario[2][3] = "[15:55 - 16:50] M1";
        horario[3][3] = "[17:10 - 18:95] TUT";
        horario[4][3] = "[18:05 - 19:00] M4";
        horario[5][3] = "[19:15 - 20:10] M3";
        horario[6][3] = "[20:10 - 21:05] M3";

        horario[0][4] = "Divendres";
        horario[1][4] = "[15:00 - 15:55] M3";
        horario[2][4] = "[15:55 - 16:50] M3";
        horario[3][4] = "[17:10 - 18:95] M3";
        horario[4][4] = "[18:05 - 19:00] EIE";
        horario[5][4] = "[19:15 - 20:10] EIE";
        horario[6][4] = "[20:10 - 21:05] -";


        switch (dia.toLowerCase()) {
            case "dl":
                day = 0;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(horario[i][day]);
                }
                break;

            case "dm":

                day = 1;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(horario[i][day]);
                }
                break;

            case "dx":

                day = 2;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(horario[i][day]);
                }
                break;

            case "dj":

                day = 3;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(horario[i][day]);
                }
                break;

            case "dv":

                day = 4;

                for (int i = 0; i <= 6; i++) {
                    System.out.println(horario[i][day]);
                }
                break;

            default:

                System.out.println("Dia incorrecto");
                break;

        }


    }

    public static int switchMeses(int dia) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce el mes en numeros: ");
        dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es enero.");
                break;

            case 2:
                System.out.println("Es febrero.");
                break;

            case 3:
                System.out.println("Es marzo.");
                break;

            case 4:
                System.out.println("Es abril.");
                break;

            case 5:
                System.out.println("Es mayo.");
                break;

            case 6:
                System.out.println("Es junio.");
                break;

            case 7:
                System.out.println("Es julio.");
                break;

            case 8:
                System.out.println("Es agosto.");
                break;

            case 9:
                System.out.println("Es septiembre.");
                break;

            case 10:
                System.out.println("Es octubre.");
                break;

            case 11:
                System.out.println("Es noviembre.");
                break;

            case 12:
                System.out.println("Es diciembre.");
                break;

            default:
                System.out.println("Incorrecto.");
                break;
        }

        return dia;
    }

    public static String noSwitch(int dia) {

        Scanner scan = new Scanner(System.in);

        String[] meses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        System.out.println("Introduce el dia que desees imprimir: ");
        dia = scan.nextInt() - 1;

        System.out.println("El dia es: " + meses[dia]);

        return meses[dia];
    }


    public static double sumaNums(double num1, double num2) {
        return num1 + num2;
    }

    public static double divisioNums(double num1, double num2) {
        return num1 / num2;
    }

    public static void impresio() {
        System.out.println(sumaNums(2.5, 3.6));
        System.out.println(divisioNums(25.3, 5.15));
    }

    public static String dispositivoID(String id) {


        System.out.println("Bienvenido al buscador de dispositivos.");
        Scanner scan = new Scanner(System.in);
        String[][] dispositivos = {
                {"1.", "HP", "GK100", "19,5"},
                {"2.", "HP", "GH245", "20,5"},
                {"3.", "DELL", "DS500", "16,5"},
                {"4.", "DELL", "NB200", "16,5"},
                {"5.", "Lenovo", "CK67UI", "20"},
                {"6.", "Lenovo", "85UD34", "18"},
        };

        System.out.println("Introduce el ID del dispositivo que deseas consultar: ");
        int idB = scan.nextInt();

        if (idB >= 1 && idB <= 6) {
            for (int j = 0; j < dispositivos[idB - 1].length; j++) {
                System.out.println(dispositivos[idB - 1][j]);
            }
        } else {
            System.out.println("Numero incorrecto");
        }
        return "idB";
    }


    public static double calcSuma(double n1, double n2) {
        double res = n1 + n2;
        return res;
    }

    public static double calcResta(double n1, double n2) {
        double res = n1 - n2;
        return res;
    }

    public static double calcMultiplicacion(double n1, double n2) {
        double res = n1 * n2;
        return res;
    }

    public static double calcDivision(double n1, double n2) {
        double res = n1 / n2;
        return res;
    }


}







