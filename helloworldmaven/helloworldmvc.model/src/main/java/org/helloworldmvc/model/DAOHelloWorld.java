package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {

	
	private static String FileName ="HelloWorld.txt";
	private static DAOHelloWorld instance = null;
	private String helloWorldMessage=null;
	
	
	private DAOHelloWorld()
	{
		
	}
	
	public static DAOHelloWorld getInstance()
	{
		return instance;
	}
	
	
	private static void setInstance(DAOHelloWorld instance)
	{
		
	}
	
	private void readFile() throws IOException
	{
		
		BufferedReader fichier = new BufferedReader(new FileReader(FileName));
		
		
		while ((helloWorldMessage = fichier.readLine()) != null)
		{
			System.out.println(helloWorldMessage);
		}
		
	}
	
	public String getHelloMessage()
	{
		return helloWorldMessage;
	}
	public void setHelloMessage(String HelloWorldMessage)
	{
		this.helloWorldMessage = HelloWorldMessage;
	}
	
}
