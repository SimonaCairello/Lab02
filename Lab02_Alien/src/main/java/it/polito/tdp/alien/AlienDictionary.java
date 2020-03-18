package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<WordEnhanced> dictionary;

	public AlienDictionary() {
		this.dictionary = new LinkedList<WordEnhanced>();
	}

	public void addWord(String alienWord, String translation) {
		for(WordEnhanced w : this.dictionary)
			if(w.getAlien().equals(alienWord))
				w.addTranslation(translation);
		WordEnhanced w = new WordEnhanced(alienWord);
		this.dictionary.add(w);
		w.addTranslation(translation);
	}
	
	public String translateWord(String alienWord) {
		for(WordEnhanced w : this.dictionary)
			if(w.getAlien().equals(alienWord))
				return w.getTranslate();
		return "Parola inesistente!\n";
	}
	
	public void reset() {
		this.dictionary.clear();
	}
}
