public class NotificadorEmail implements CanalNotificacion {
    public void enviar(String destinatario, String mensaje) {
        if (destinatario.contains("@")) System.out.println("Email enviado a " + destinatario + ": " + mensaje);
        else System.out.println("Email inválido.");
    }
}
