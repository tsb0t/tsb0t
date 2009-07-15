import com.jtsc.*;
public class connect {
	
	boolean connected = false;
	String server = "";
	int port = 0;
	
	public connect()
	{
		
	}
	
	public boolean open(String ip, int Port)
	{
		server = ip;
		port = Port;
		return false;
	}
}
