package cuenta;
/**
 * Clase CuentaMorenteMartinAntonioJose2324T4 que representa una cuenta bancaria.
 * @author antmo
 */


public class CuentaMorenteMartinAntonioJose2324T4 {
/**
 * Atributos de la clase
 * private String nombre; // Nombre del titular de la cuenta.
 * private String cuenta; // Número de la cuenta.
 * private double saldo; // Saldo actual de la cuenta.
 * private double tipoInteres; // Tipo de interés de la cuenta.
 */
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set    
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }


        private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    /**
    * Constructor por defecto de la clase.
    */
   
    public CuentaMorenteMartinAntonioJose2324T4 ()
    {
    }
   /**
    * Constructor con parámetros de la clase.
    * @param nom Nombre del titular de la cuenta.
    * @param cue Número de la cuenta.
    * @param sal Saldo inicial de la cuenta.
    * @param tipo Tipo de interés de la cuenta.
    */
   
    public CuentaMorenteMartinAntonioJose2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
 /**
  * Método para asignar un nombre al titular de la cuenta
  * @param nom Nomnre del titular.
  */
    
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
   /**
    * Método para obtener el nombre del titular de la cuenta.
    * @return Nombre del titular
    */
   
    public String obtenerNombre()
    {
        return getNombre();
    }
/**
 * Método para obtener el estado actual de la cuenta.
 * @return Saldo actual de la cuenta.
 */
    
     public double estado ()
    {
        return getSaldo();
    }
/**
 * Método para ingresar una cantidad en la cuenta.
 * @param cantidad Cantidad a ingresar.
 * @param concepto Concepto del ingreso.
 * @throws Exception Si la cantidad es negativa.
 */
    public void ingresar(double cantidad, String concepto) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

/**
 * Método para retirar una cantidad de la cuenta.
 * @param cantidad Cantidad a retirar.
 * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
 */    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Método para obtener el número de la cuenta.
 * @return Número de la cuenta.
 */ 
    public String obtenerCuenta ()
    {
        return getCuenta();
    }
}
