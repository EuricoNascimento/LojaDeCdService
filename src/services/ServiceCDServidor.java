package services;

import interfaces.IServiceCDServidor;
import model.CD;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServiceCDServidor extends UnicastRemoteObject implements IServiceCDServidor {
    private List<CD> cds = new ArrayList<>();

    public ServiceCDServidor() throws RemoteException {
        inicializarCds();
    }

    @Override
    public void registrarCD(CD cd) throws RemoteException {
        cds.add(cd);
    }

    @Override
    public List<CD> obterCDs() throws RemoteException {
        return cds;
    }

    private void inicializarCds() {
        cds.add(new CD("Thriller", "Michael Jackson", "Pop", 25.0));
        cds.add(new CD("Back in Black", "AC/DC", "Rock", 20.0));
    }
}
