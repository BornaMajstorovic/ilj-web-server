package hr.fer.ilj.webserver;

import java.io.BufferedReader;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Protocol {
  private static final Logger LOG = LoggerFactory.getLogger(Protocol.class);

  public String processInput(BufferedReader in) throws IOException {
	String s1 = "<html> <head> </head> <body> <p> txt </p> </body> </html>"; 
    return "HTTP 200 OK\r\n"
    		+ "Content-Length: " + s1.length() + "\r\n\r\n" + s1;
  }

}
