package org.geoji.app.fruit;

import org.eclipse.jetty.server.Server;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try {
			Server server = new Server(8080);
			server.start();
			server.dumpStdErr();
			server.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
