import java.util.ArrayList;
public class GestorAlertas {
    private ArrayList<CanalNotificacion> canales = new ArrayList<CanalNotificacion>();
    public void agregarCanal(CanalNotificacion canal) { canales.add(canal); }
    public void difundir(String destinatario, String mensaje) {
        for (CanalNotificacion canal : canales) canal.enviar(destinatario, mensaje);
    }
}
