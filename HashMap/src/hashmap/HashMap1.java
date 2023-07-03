package hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, String> canciones = new HashMap<String, String>();
		canciones.put("Mein Herz brennt", "Nun liebe Kinder, gebt fein acht. Ich bin die Stimme aus dem Kissen...");
		canciones.put("Ohne dich", "Ich werde in die Tannen gehen. Dahin, wo ich sie zuletzt gesehen. Doch der...");
		canciones.put("Sonne", "1, 2, 3, 4, 5, 6, 7, 8, 9, aus Alle warten auf das Licht Fürchtet euch, fürchtet...");
		canciones.put("Ich tu dir weh", "Ich tu dir weh Tut mir nicht leid Das tut dir gut Hört wie es schreit...");

		System.out.println(canciones.get("Mein Herz brennt"));
		Set<String> claves = canciones.keySet();
		for (String clave : claves) {
			System.out.println(clave.concat(": " + canciones.get(clave)));
		}
	}

}
