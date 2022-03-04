package Utils;

public class ExcepcionMensaje extends RuntimeException {
    private static final long serialVersionUID=1L;

    public ExcepcionMensaje(String mensaje) {
        super (mensaje);
    }
}
