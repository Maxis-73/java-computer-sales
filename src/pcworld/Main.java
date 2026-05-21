package pcworld;
import pcworld.model.Computadora;
import pcworld.model.Monitor;
import pcworld.model.Mouse;
import pcworld.model.Teclado;
import pcworld.service.Orden;

public class Main {
    static void main(String[] args) {
        //Crear objetos
        Mouse mouseLogitech = new Mouse("Bluetooth", "Logitech");
        Teclado tecladoRazer = new Teclado("Alambrico", "Razer");
        Monitor benq = new Monitor("BenQ", 27);
        Computadora pc = new Computadora("Armada", benq, tecladoRazer, mouseLogitech);

        //Creamos orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(pc);
        orden1.mostrarOrden();
    }
}
