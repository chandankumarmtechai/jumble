package com.game.algorithm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.game.puzzle.Puzzle;

@Component
public class Algorithm {
	private String filename ="./src/main/resources/static/words.txt";
	
	public String permutate(String word)
	{
		int len = word.length();
		int duplicate[] = new int[len];
		for(int i=0; i<len; i++)
		{
			duplicate[i] = 0;
		}
		int gen=0;
		int count =0;
		char[] perm = new char[len];
		Random rand = new Random();
		while(count != len)
		{
		  gen= rand.nextInt(len);
		  if(duplicate[gen] == 0)
		  {
			  perm[count] = word.charAt(gen);
			  duplicate[gen]=1;
			  count++;
		  }
		}
		return new String(perm);
	}
	
	public List<Puzzle> createPuzzles() throws Exception
	{
		List<Puzzle> puzzles = new ArrayList<Puzzle>();
		String temp;
		File file = new File(this.filename); 
	    Scanner sc = new Scanner(file); 
	    String line[] = new String[2];
	    while (sc.hasNextLine())
	    {
	    	temp = sc.nextLine();
	    	line = temp.split("#", 2); 
	    	puzzles.add(new Puzzle(line[0].toLowerCase(),permutate(line[0]).toLowerCase(),line[1]));
	    }
	    sc.close();
	    return puzzles;
	}

}
