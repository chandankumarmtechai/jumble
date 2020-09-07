package com.game.puzzle;

public class Beans implements Cloneable{
	protected String type;
	
	public Object clone()
	{
		Object clone = null;
		try
		{
			clone = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return clone;
	}
	

}
