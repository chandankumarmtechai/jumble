package com.game.puzzle;

public class ScoreScheme {
	int pos;
	int neg;
	int penality;

	
	public ScoreScheme(int pos, int neg, int penality) {
		super();
		this.pos = pos;
		this.neg = neg;
		this.penality = penality;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getNeg() {
		return neg;
	}
	public void setNeg(int neg) {
		this.neg = neg;
	}
	public int getPenality() {
		return penality;
	}
	public void setPenality(int penality) {
		this.penality = penality;
	}

}
