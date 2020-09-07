package com.game.jumble.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.puzzle.BeansCache;
import com.game.puzzle.Puzzle;
import com.game.puzzle.Puzzles;

@RestController
public class BuildAPI {

	
	@GetMapping("/puzzles")
	public List<Puzzle> getAllPuzzles()
	{
		Puzzles p = (Puzzles) BeansCache.getBeans("puzzles");
		return p.getDict();
	}
	
	@RequestMapping(value = "/hello")
	public String say()
	{
		return "hello";
	}

}
