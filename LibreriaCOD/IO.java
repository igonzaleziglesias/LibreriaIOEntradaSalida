package LibreriaCOD;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IO {

    public final static int CONSOLA = 0;
    public final static int VENTANA = 1;

    public static int introducirInt(int controlador, String msg) {
        Scanner ler = new Scanner(System.in);
        int datos = 0;
        switch (controlador) {
            case CONSOLA:
                System.out.println(msg);
                return ler.nextInt();
            case VENTANA:
                return Integer.parseInt(JOptionPane.showInputDialog(msg));
            default:
                break;
        }
        return datos;
    }

    public static float introducirFloat(int controlador, String msg) {
        Scanner ler = new Scanner(System.in);
        float datos = 0;
        switch (controlador) {
            case CONSOLA:
                System.out.println(msg);
                datos = ler.nextFloat();
                return datos;             
            case VENTANA:
                return Float.parseFloat(JOptionPane.showInputDialog(msg));
            default:
                break;
        }
        return datos;
    }

    public static double introducirDouble(int controlador, String msg) {
        Scanner ler = new Scanner(System.in);
        double datos = 0;
        switch (controlador) {
            case CONSOLA:
                System.out.println(msg);
                return ler.nextDouble();
            case VENTANA:
                return Double.parseDouble(JOptionPane.showInputDialog(msg));
            default:
                break;
        }
        return datos;
    }

    public static char introducirChar(int controlador, String msg) {
        Scanner ler = new Scanner(System.in);
        char datos = 'a';
        switch (controlador) {
            case CONSOLA:
                System.out.println(msg);
                return ler.next().charAt(0);
            case VENTANA:
                String st = JOptionPane.showInputDialog(msg);
                return st.charAt(0);
            default:
                break;
        }
        return datos;
    }

    public static String introducirString(int controlador, String msg) {
        Scanner ler = new Scanner(System.in);
        String datos = "";
        switch (controlador) {
            case CONSOLA:
                System.out.println(msg);
                return ler.nextLine();
            case VENTANA:
                return JOptionPane.showInputDialog(msg);
            default:
                break;
        }
        return datos;
    }

    public static void devolver(int controlador, int dato) {
        switch (controlador) {
            case CONSOLA:
                System.out.println("dato:" + dato);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, dato);
                break;
            default:
                break;
        }
    }

    public static void devolver(int controlador, float dato) {
        switch (controlador) {
            case CONSOLA:
                System.out.println("dato:" + dato);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, dato);
                break;
            default:
                break;
        }
    }

    public static void devolver(int controlador, char dato) {
        switch (controlador) {
            case CONSOLA:
                System.out.println("dato:" + dato);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, dato);
                break;
            default:
                break;
        }
    }

    public static void devolver(int controlador, double dato) {
        switch (controlador) {
            case CONSOLA:
                System.out.println("dato:" + dato);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, dato);
                break;
            default:
                break;
        }
    }

    public static void devolver(int controlador, String dato) {
        switch (controlador) {
            case CONSOLA:
                System.out.println("dato:"+dato);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, dato);
                break;
            default:
                break;
        }
    }
}
