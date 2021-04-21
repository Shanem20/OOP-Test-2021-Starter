package ie.tudublin;

import java.util.*;
import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>(); // Creates ArrayList object
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";


	void loadScore()
	{
		// Split scores into indivudal arrays and test output using for-each loop
		String[] arr = score.split("");
		for(String character : arr)
		{
			System.out.print(character + " ");
		}


		for(String character : arr)
		{
			notes.add(character);
		}
	}

	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	
	}

	void drawLines()
	{
		stroke(0);
		line(45, 110, 940, 110);
		line(45, 170, 940, 170);
		line(45, 230, 940, 230);
		line(45, 290, 940, 290);
		line(45, 350, 940, 350);
	}
	
	public void setup() 
	{
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
