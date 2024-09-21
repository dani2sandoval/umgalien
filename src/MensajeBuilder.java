import java.util.ArrayList;
import java.util.List;

public class MensajeBuilder {

    List<String> para = new ArrayList<>();
    String tema;
    String contenido;

    public MensajeBuilder agregarDestinatario(String destinatario) {
        this.para.add(destinatario);
        return this;
    }

    public MensajeBuilder tema(String tema) {
        this.tema = tema;
        return this;
    }

    public MensajeBuilder contenido(String contenido) {
        this.contenido = contenido;
        return this;
    }

    public Mensaje construir() {
        if (para.isEmpty() || tema == null || contenido == null) {
            throw new IllegalArgumentException("introduce los datos de mensaje");
        }
        return new Mensaje(this);
    }
}

