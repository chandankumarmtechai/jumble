package com.game.puzzle;

import java.util.List;

public class Puzzles extends Beans{
	private List<Puzzle> dict;
	
	public void setType(String type)
	{
		this.type =  type;
	}

	public Puzzles()
	{
		
	}
	public Puzzles(List<Puzzle> dict) {
		super();
		this.dict = dict;
	}

	public String getType() {
		return this.type;
	}

	public List<Puzzle> getDict() {
		return dict;
	}

	public void setDict(List<Puzzle> dict) {
		this.dict = dict;
	}
	
	public String toString()
	{
		return this.dict.toString();
	}

}
