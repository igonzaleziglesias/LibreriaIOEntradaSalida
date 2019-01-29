package LibreriaCOD;
/**
 *
 * @author igonzaleziglesias
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class IO {

    public final static int CONSOLA = 0;
    public final static int VENTANA = 1;

    /**
     * Metodo para introducir una variable int por teclado.
     *
     * @param controlador para elegir como introducir el int, si por consola o
     * ventana.
     * @param msg mensaje para mostrar cuando se pide el int.
     * @return el int.
     */
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

    /**
     * Metodo para introducir una variable float por teclado.
     *
     * @param controlador para elegir como introducir el float, si por consola o
     * ventana.
     * @param msg mensaje para mostrar cuando se pide el float.
     * @return el float.
     */
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

    /**
     * Metodo para introducir una variable double por teclado.
     *
     * @param controlador para elegir como introducir el double, si por consola
     * o ventana.
     * @param msg mensaje para mostrar cuando se pide el double.
     * @return el double.
     */
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

    /**
     * Metodo para introducir una variable char por teclado.
     *
     * @param controlador para elegir como introducir el char, si por consola o
     * ventana.
     * @param msg mensaje para mostrar cuando se pide el char.
     * @return el char.
     */
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

    /**
     * Metodo para introducir una variable String por teclado.
     *
     * @param controlador para elegir como introducir el string, si por consola
     * o ventana.
     * @param msg mensaje para mostrar cuando se pide el String.
     * @return el string.
     */
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

    /**
     * Metodo para imprimir por pantalla un int.
     *
     * @param controlador para elegir como devolver el int, si por consola o por
     * ventana.
     * @param dato el int que vamos a devolver por pantalla.
     */
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

    /**
     * Metodo para imprimir por pantalla un float.
     *
     * @param controlador para elegir como devolver el float, si por consola o
     * por ventana.
     * @param dato el float que vamos a devolver por pantalla.
     */
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

    /**
     * Metodo para imprimir por pantalla un char.
     *
     * @param controlador para elegir como devolver el char, si por consola o
     * por ventana.
     * @param dato el char que vamos a devolver por pantalla
     */
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

    /**
     * Metodo para imprimir por pantalla un double.
     *
     * @param controlador para elegir como devolver el char, si por consola o
     * por ventana
     * @param dato el double que vamos a devolver por pantalla
     */
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

    /**
     * Metodo para imprimir por pantalla un String.
     *
     * @param controlador para elegir como delvolver el string, si por consola o
     * por ventana
     * @param dato el string que vamos a devolver por pantalla
     */
    public static void devolver(int controlador, String dato) {
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
}
