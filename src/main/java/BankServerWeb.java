import ServerJWS.BankService;
import jakarta.xml.ws.Endpoint;

public class BankServerWeb {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2001/",new BankService());
    }

    
}
