package com.game.jumble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.game.algorithm.Algorithm;
import com.game.puzzle.BeansCache;
import com.game.puzzle.Puzzles;

@SpringBootApplication
public class JumbleApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JumbleApplication.class, args);
		
		BeansCache.loadCache();
		
		////Puzzles p = (Puzzles) BeansCache.getBeans("puzzles");
		//System.out.print(p.toString());
		//Algorithm a = new Algorithm();
		//System.out.print(a.permutate("mango"));
		//a.createPuzzles();
	}

}
