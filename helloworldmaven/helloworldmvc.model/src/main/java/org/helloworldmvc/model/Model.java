package org.helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {

	private static String FileName ="HelloWorld.txt";
	private String helloWorldMessage=null;
	
	
	public String getHelloWorld() throws IOException {
	
		BufferedReader fichier = new BufferedReader(new FileReader(FileName));
		
		helloWorldMessage = fichier.readLine();
		
		return helloWorldMessage;
	}
}
