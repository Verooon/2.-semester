import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class RmiServer implements RemoteMessageList
{
  private ArrayList<String> messageList = new ArrayList<String>();

  public RmiServer() throws RemoteException
  {
    UnicastRemoteObject.exportObject(this,0);
  }

  public void start() throws RemoteException, AlreadyBoundException
  {
    Registry registry = LocateRegistry.createRegistry(1096);
    registry.bind("Msg", this);
  }

  @Override public void addMessage(String message)
  {
    messageList.add(message);
  }
}
