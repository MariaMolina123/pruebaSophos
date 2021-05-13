package co.com.prueba.certificacion.enums;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum  Ambiente {

    TOTTUS("tottus", "https://www.tottus.com.pe/");

    private final String llave;
    private final String valor;
    private static Map<String, String> url;

    private Ambiente(String llave, String valor){
        this.llave = llave;
        this.valor = valor;

    }
    static {
        Map<String, String> ambientes = new HashMap<>();
        for (Ambiente uri :Ambiente.values()){
            ambientes.put(uri.llave, uri.valor);
        }
        url = Collections.unmodifiableMap(ambientes);

    }

    public static String obtenerUrl(String ambiente) {
        if(url.containsKey(ambiente)){
            return url.get(ambiente);
        }
        return null;
    }


}
