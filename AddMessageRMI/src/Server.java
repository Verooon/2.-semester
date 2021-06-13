import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server
{
  public static void main(String[] args)
      throws RemoteException, MalformedURLException, AlreadyBoundException
  {
    startRegistry();

    RmiServer server = new RmiServer();
    server.start();
    System.out.println("Server started :) ");
  }

  public static void startRegistry() throws RemoteException
  {
     System.out.println("Registry started :) ");
  }
}
