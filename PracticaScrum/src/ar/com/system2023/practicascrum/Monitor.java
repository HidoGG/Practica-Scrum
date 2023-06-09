
package ar.com.system2023.practicascrum;

public class Monitor{
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    public Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); //llamado al contructor vacio
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    // Ingresamos manualmente el getIdMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
    
    
}
