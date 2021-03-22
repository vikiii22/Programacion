import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MApas {
    public static void main(String[] args) {
        Map<String, String> contactos=new HashMap<>();
        contactos.put("Ana", "665412457");
        Map<String, List<String>> aficiones=new HashMap<>();
        aficiones.put("Ana", new ArrayList<>());
        aficiones.get("Ana").add("Pescar");
        contactos.values();
        contactos.isEmpty();
        aficiones.values();
        aficiones.isEmpty();
    }
}
