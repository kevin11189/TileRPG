package com.krutten.tilegame.io;

import java.io.*;
import java.util.Scanner;

import com.krutten.tilegame.Game;

public class Save {
	private File file;
	private PrintWriter outputFile;
	private Scanner inputFile;
	
	public Save(String filename) throws FileNotFoundException {
	
		file = new File(filename);
		
		
	}
	
	public void saveFile() {
		try {
			outputFile = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outputFile.println(Game.getPlayer().getX());
		outputFile.println(Game.getPlayer().getY());
		outputFile.close();
	}
	
	public void loadFile() throws FileNotFoundException {
		inputFile = new Scanner( file );
		Game.getPlayer().setX(Integer.parseInt(inputFile.nextLine()));
		Game.getPlayer().setY(Integer.parseInt(inputFile.nextLine()));
		inputFile.close();
	}



}
