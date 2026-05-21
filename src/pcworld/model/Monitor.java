package pcworld.model;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double pulgadas;
    private static int contadorMonitores;

    private Monitor() {
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double pulgadas) {
        this();
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                '}';
    }
}
