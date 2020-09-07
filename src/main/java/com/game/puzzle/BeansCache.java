package com.game.puzzle;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.game.algorithm.Algorithm;

@Component
public class BeansCache {
	
	private static Algorithm algo = new Algorithm();
	private static Hashtable<String, Beans> beansMap = new Hashtable<String, Beans>();
	
	public static Beans getBeans(String type)
	{
		Beans cachedBeans = beansMap.get(type);
		return (Beans) cachedBeans.clone();
	}
	
	public static void loadCache() throws Exception
	{
		Puzzles pzls = new Puzzles(algo.createPuzzles());
		pzls.setType("puzzles");
		beansMap.put(pzls.getType(), pzls);
	}

}
