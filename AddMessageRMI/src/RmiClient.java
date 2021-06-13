import java.rmi.Naming;
import java.rmi.RemoteException;

public class RmiClient
{
  private RemoteMessageList server;

  public RmiClient()
  {
    try
    {
      server = (RemoteMessageList) Naming.lookup("rmi://localhost:1096/Msg");
    }
      catch (Exception e)
    {
      e.printStackTrace();
    }
  }

  public void send(String text) throws RemoteException
  {
    server.addMessage(text);
  }
}
