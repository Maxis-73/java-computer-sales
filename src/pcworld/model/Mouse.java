package pcworld.model;

public class Mouse extends DispositivoEntrada {
    private final int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idMouse = ++contadorMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "idMouse=" + idMouse +
                "} " + super.toString();
    }
}
