package com.game.puzzle;

public class Puzzle {
	private String word;
	private String jumbled;
	private String hint;
	
	public Puzzle()
	{
		
	}

	public Puzzle(String word, String jumbled, String hint) {
		super();
		this.word = word;
		this.jumbled = jumbled;
		this.hint = hint;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getJumbled() {
		return jumbled;
	}

	public void setJumbled(String jumbled) {
		this.jumbled = jumbled;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	} 
	
	public String toString()
	{
		return this.word + "-"+ this.jumbled + "-"+ this.hint;
	}
	
	

}
