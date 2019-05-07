package org.helloworldmvc.main;

import java.io.IOException;

import org.helloworldmvc.model.Model;
import org.helloworldmvc.view.View;
import org.hellowworldmvc.controller.Controller;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		View vue = new View(); //Instanciation vue
		
		Model model = new Model(); //Instanciation model
		
		Controller controller = new Controller(vue,model); ////Instanciation Controller
		
		
		controller.run(); //Appelle run de controller
		
	}

}
