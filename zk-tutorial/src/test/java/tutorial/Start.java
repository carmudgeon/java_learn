package tutorial;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
public class Start {
	public static void main(String[] args){
		
		try{
            int port=8888;
            final String WEBAPPDIR = "src/main/webapp";

            final Server server = new Server(port);

            final String CONTEXTPATH = "/zk-tutorial";

            WebAppContext bb = new WebAppContext();
            bb.setServer(server);
            bb.setContextPath(CONTEXTPATH);
            bb.setWar(WEBAPPDIR);
            server.setHandler(bb);


            server.start();
            server.join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
	}
}
