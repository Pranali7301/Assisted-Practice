package assistant_project;

import java.util.regex.Pattern;

public class RegularExp {
	public static void main(String[] args) {
		
		System.out.println ("satalepranali29@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","satalepranali29@gmail.com"));
		System.out.println ("virendra@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","virendra@gmail.com"));
		System.out.println ("test123prepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9960404093 : "+Pattern.matches("\\d{10}","9960404093"));
		System.out.println ("Pranali7301Satale29 : "+Pattern.matches("[SWA][a-z]+\\d{3}+[a-z0-9]+","Pranali7301Satale29"));
		
	}

}


