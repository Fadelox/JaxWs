package serveur;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:6655/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web services deployed sur "+url);
    }
}
