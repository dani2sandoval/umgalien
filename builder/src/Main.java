public class Main {
    public static void main(String[] args) {

        MensajeBuilder builder = new MensajeBuilder();
        Mensaje mensaje = builder
                .agregarDestinatario("melvindan98@gmail.com")
                .agregarDestinatario("juanperez123@gmail.com")
                .tema("Prueba")
                .contenido("Hola, como estas")
                .construir();

        System.out.println(mensaje);

    }
}
