package SOAPClients;


import Proxy.BankService;
import Proxy.BankServices;
import Proxy.Compte;

public class Client {
    public static void main(String[] args) {
         BankService stube=new BankServices().getBankServicePort();
        System.out.println("-------------------------------------------");
        System.out.println("10$ => "+stube.conversionToDH(10)+" DH");
        System.out.println("*******************************************");
        Compte newCompte = stube.createNewCompte();
        System.out.println("New Compte: "+newCompte.getCode()+" "+newCompte.getSolde());
        System.out.println("*******************************************");
    }

}
