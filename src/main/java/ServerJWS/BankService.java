package ServerJWS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BankServices")
public class BankService {
    @WebMethod(operationName="conversionToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return 11*mt;
    }
    @WebMethod(operationName="createNewCompte")
    public Compte createCompte(){
        return  new Compte((int)Math.random(),Math.random()*9000);
    }

    @WebMethod(operationName="clientComptes")
    List<Compte> getComptes(){
        return List.of(
                new Compte((int)(Math.random()*10),Math.random()*9000),
                new Compte((int)(Math.random()*10),Math.random()*9000),
                new Compte((int)(Math.random()*10),Math.random()*9000)
        );
    }
}
