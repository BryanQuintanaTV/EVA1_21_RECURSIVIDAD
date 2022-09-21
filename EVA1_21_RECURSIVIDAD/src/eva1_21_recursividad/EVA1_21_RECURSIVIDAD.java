/*
 * " Evaluación 1 Práctica 21
 *   21 / 09 / 2022 "
 */
package eva1_21_recursividad;

/**
 * @author Usuario
 */
public class EVA1_21_RECURSIVIDAD {

    public static void main(String[] args) {
        System.out.println("MAIN " + A());
    }
    
    public static String A(){
        return "A" + B();
    }
    
    public static String B(){
        return "B" + C();
    }
    
    public static String C(){
        return "C";
    }
    
}
