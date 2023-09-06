package demo;

import org.apache.logging.log4j.LogManager;
//import org.apache.*;
import org.apache.logging.log4j.*;


public class Loggerdemo {

	private static Logger logger =  LogManager.getLogger(Loggerdemo.class);
	public static void main(String[] args)
    {
		// TODO Auto-generated method stub
		
    System.out.println("\n Hello world \n");
	logger.trace("This is trace message");	
    logger.info("This is information message");
    logger.error("This is error message");
    logger.warn("This is a warn message");
    logger.fatal("This is a fatal message");
    
    System.out.println("\n Completed ");
	}

}
