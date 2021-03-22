import java.util.ArrayList;
import java.util.List;

public class SmartPhone extends DispositivoMovil {
    private final String SO;
    private final List<String>appsInstaladas;

    public SmartPhone(String IMEI, String numeroTelefono, int amperajeBateria, double pulgadas, String SO) {
        super(IMEI, numeroTelefono, amperajeBateria, pulgadas);
        this.SO = SO;
        this.appsInstaladas =new ArrayList<>();
    }

    public String getSO() {
        return SO;
    }

    public List<String> getAppsInstaladas() {
        return appsInstaladas;
    }

    public void anyadeApps(String app){
        appsInstaladas.add(app);
    }

    public void borraApps(String app){
        appsInstaladas.remove(app);
    }
    @Override
    public String info(){
        String salida=super.info()+"\n";
        salida+="SO"+SO;
        for (String s:appsInstaladas) {
            salida+="\t"+"\n";
        }
        return salida;
    }
    public static void main(String[] args) {
        SmartPhone Xiaomi = new SmartPhone("4334", "966125434", 4500, 6, "Android");
        System.out.println(Xiaomi.info());
        Xiaomi.getAppsInstaladas().add("WhatsApp");
        Xiaomi.getAppsInstaladas().add("Instagram");
        Xiaomi.getAppsInstaladas().add("Telegram");
        Xiaomi.getAppsInstaladas().add("Snaptach");
        System.out.println(Xiaomi.info());

    }
}
