import java.util.logging.Level;
import java.util.logging.Logger;

import com.jtsc.*;
import com.jtsc.core.jtscCore;
import com.jtsc.exception.jtscException;
import com.jtsc.exception.jtscExceptionChannel;
import com.jtsc.exception.jtscExceptionServer;
import com.jtsc.exception.jtscExceptionUser;
import com.jtsc.object.server;
import com.jtsc.object.serverQuery;
import com.jtsc.object.user;
import com.jtsc.persistant.jtscPersistant;
import com.jtsc.test.globalTest;
import com.jtsc.type.serverOption;
public class connect {
	
	boolean connected = false;
	String server = "";
	int port = 0;
	
	public connect()
	{
		
	}
	
	public boolean open(String ip, int Port)
	{
		user botuser = new user();
		botuser.setLogin("bot");
		botuser.setNickName("bot");
		botuser.setSlogin("bot");
		botuser.setSpassword("sex123");
		botuser.setPassword("sex123");
		jtscPersistant instance = new jtscPersistant(); // Create new objectPersistant system
        try {
            instance.connect("localhost", 51234);
            instance.sLogin("bot", "sex123"); // connect with superadmin account
            server serverExemple;
			serverExemple = (server) instance.find(server.class, 8767); // Find serverObject correspond	to server with port 8767, but you can find other object. (user, channel ...)
            System.out.println(serverExemple.getName());
            instance.selectServer(serverExemple); // select serverExemple.
            instance.selectServer(serverExemple);
            instance.getCoreSystem().sendServerMessage("Message test"); //User core function, select coreSystem for non persistant function type. But not send message because server is down.
            instance.getCoreSystem().loginToServer(botuser);
            
        } 
	 catch (jtscExceptionUser ex) {
    } catch (jtscExceptionServer ex) {
    } catch (jtscExceptionChannel ex) {
    } catch (jtscException ex) {;
    }
        finally {
            //instance.exitAndQuit(); //Close connection and quit Java.
        }
		return false;
	}
}
