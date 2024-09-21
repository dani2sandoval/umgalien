import java.util.ArrayList;
import java.util.List;

public class Mensaje implements IMensaje{
    private List<String> para;
    private String tema;
    private String contenido;

    Mensaje(MensajeBuilder builder) {
        this.para = builder.para;
        this.tema = builder.tema;
        this.contenido = builder.contenido;
    }

    public List<String> getPara() {
        return para;
    }

    public String getTema() {
        return tema;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Mensaje para " + para + " tema " + tema + " contenido " + contenido;

    }
}

