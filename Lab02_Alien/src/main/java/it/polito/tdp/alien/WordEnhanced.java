package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	private String alien;
	private List<String> translate;
	
	public WordEnhanced(String alien) {
		this.alien = alien;
		this.translate = new LinkedList<String>();
	}

	public String getAlien() {
		return alien;
	}

	public String getTranslate() {
		String s = "";
		for(String st : translate)
			s += st+"\n";
		return s;
	}

	public void addTranslation(String translation) {
		this.translate.add(translation);
	}

	@Override
	public boolean equals(Object obj) {
		if(this.alien.equals(obj))
			return true;
		return false;
	}	

}
