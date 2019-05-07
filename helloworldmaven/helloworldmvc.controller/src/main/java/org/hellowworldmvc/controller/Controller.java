package org.hellowworldmvc.controller;

import java.io.IOException;

import org.helloworldmvc.Contract.IModel;
import org.helloworldmvc.Contract.IView;

public class Controller {

	private final IView view;
	private final IModel model;
	
	public Controller(final IView view, final IModel model)
	{
		this.view = view;
		this.model = model;
	}
	
	public void run() throws IOException
	{
		this.view.displayMessage(this.model.getHelloWorld());	
	}
	
}
