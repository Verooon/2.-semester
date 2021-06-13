import java.rmi.RemoteException;
import java.util.Scanner;

public class Client
{
  public static void main(String[] args) throws RemoteException
  {
    RmiClient client =  new RmiClient();

    Scanner input = new Scanner(System.in);

   String msg = " ";

    while (msg != "End")
    {
      System.out.println("Type message you wanna add "
          + "if you wanna stop type End: ");
       msg = input.nextLine();
      client.send(msg);
    System.out.println("message sent");
   }
   System.out.println("you finished adding messages");
  }
}
