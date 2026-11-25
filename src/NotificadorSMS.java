public class NotificadorSMS implements CanalNotificacion {
    public void enviar(String destinatario, String mensaje) {
        if (destinatario.length() >= 8) System.out.println("SMS enviado a " + destinatario + ": " + mensaje);
        else System.out.println("Número inválido.");
    }
}
