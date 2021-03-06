package org.ssglobal.training.codes.modifiers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveLogin {

	public static void main(String[] args) {
		Login login1 = new Login();
		login1.username = "sjctrags";
		login1.password = "admin2255";
		
		Login login2 = new Login();
		login2.username = "postgres";
		login2.password = "root";
		
		Login login3 = new Login();
		login2.username = "admin";
		login2.password = "admin";		
		
		// Serialization
		try {
			File file = new File("./src/config/login.ser");
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(login1);
			oos.writeObject(login2);
			oos.writeObject(login3);
			
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done.");

	}

}
