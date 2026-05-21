package pcworld.model;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;
    private static  int contadorComputadoras;

    private Computadora() {
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", \n   monitor=" + monitor +
                ", \n   teclado=" + teclado +
                ", \n   mouse=" + mouse +
                '}';
    }
}
