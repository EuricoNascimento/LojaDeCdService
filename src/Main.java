import services.ServiceCDServidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            ServiceCDServidor serviceCDServidor = new ServiceCDServidor();

            LocateRegistry.createRegistry(1099);

            Naming.bind("localhost", serviceCDServidor);

            System.out.println("Servidor em execução...");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }

    }
}