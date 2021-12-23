package assessment;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JavaApplication1 {

    public static void main(String[] args) {
         try {
            InetAddress[] addresses = InetAddress.getAllByName("facebook.co.in");

            for (InetAddress address : addresses) {
                System.out.println(address);


            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find");
        }
         
         System.out.println("facebook.com/186.202.35.423");
    }
}


