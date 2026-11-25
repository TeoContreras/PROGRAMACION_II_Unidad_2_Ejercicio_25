public class main {
    public static void main(String[] args) {
        GestorAlertas gestor = new GestorAlertas();
        gestor.agregarCanal(new NotificadorEmail());
        gestor.agregarCanal(new NotificadorSMS());
        gestor.agregarCanal(new NotificadorPush());
        gestor.difundir("usuario@empresa.com", "Alerta corporativa importante");
    }
}
