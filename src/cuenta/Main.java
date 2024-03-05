package cuenta;
/**
 *Clase principal que contiene el método main y las operaciones de la cuenta.
 * @author antmo
 */
public class Main {
/**
 * Método principal que se ejecuta al iniciar el programa.
 * @param args Argumentos de la línea de comandos.
 */  
    public static void main(String[] args) {
        CuentaMorenteMartinAntonioJose2324T4 miCuentaMorenteMartinAntonioJose2324T4;
        double saldoActual;
        int x;
        /**
         * Creación de una nueva cuenta con los datos proporcionados.
         */
        miCuentaMorenteMartinAntonioJose2324T4 = new CuentaMorenteMartinAntonioJose2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaMorenteMartinAntonioJose2324T4.estado()+"€");
        opera_retiraDineroMorenteMartinAntonioJose2324T4(miCuentaMorenteMartinAntonioJose2324T4);
        
        opera_ingresaDineroMorenteMartinAntonioJose2324T4(miCuentaMorenteMartinAntonioJose2324T4);
    }
/**
 * Método para realizar una operación de ingreso de dinero en la cuenta.
 * @param miCuentaMorenteMartinAntonioJose2324T4 La cuenta en la que se va a ingresar el dinero.
 */
    private static void opera_ingresaDineroMorenteMartinAntonioJose2324T4(CuentaMorenteMartinAntonioJose2324T4 miCuentaMorenteMartinAntonioJose2324T4) {
        int x;
        double saldoActual;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaMorenteMartinAntonioJose2324T4.ingresar(x, "Ingreso en Cuenta");
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
        saldoActual = miCuentaMorenteMartinAntonioJose2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }
/**
 * Método para realizar una operación de retirada de dinero de la cuenta.
 * @param miCuentaMorenteMartinAntonioJose2324T4 La cuenta de la que se va a retirar el dinero.
 */
    private static void opera_retiraDineroMorenteMartinAntonioJose2324T4(CuentaMorenteMartinAntonioJose2324T4 miCuentaMorenteMartinAntonioJose2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaMorenteMartinAntonioJose2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
