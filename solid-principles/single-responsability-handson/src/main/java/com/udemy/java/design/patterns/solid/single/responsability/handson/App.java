package com.udemy.java.design.patterns.solid.single.responsability.handson;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author dbatista
 *
 */
public class App {
    
    public static void main(String[] args) {

        //

        try {
        	
        	var user = new UserController();
        	var uri = App.class.getClassLoader().getResource("user.json").toURI();
			//
        	user.createUser(Files.readString(Paths.get(uri)));
			
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	
        


    }
    
}
