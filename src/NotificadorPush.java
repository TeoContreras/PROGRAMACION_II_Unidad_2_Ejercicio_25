public class NotificadorPush implements CanalNotificacion {
    public void enviar(String destinatario, String mensaje) { System.out.println("Push para " + destinatario + ": " + mensaje); }
}
