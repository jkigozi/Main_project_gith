import java.io.*;

//package main_pkg;

import java.io.BufferedWriter;

public class main_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File zfile = new File("c:\new_64\ttt.txt");
		
		BufferedWriter outp = new BufferedWriter(new FileWriter(zfile)); 
		
		outp.write("Here well Here her we go");

	}

}
