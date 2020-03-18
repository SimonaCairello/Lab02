package it.polito.tdp.alien;

public class Word {
	
	private String alien;
	private String translate;
	
	public Word(String alien, String translate) {
		this.alien = alien;
		this.translate = translate;
	}

	public String getAlien() {
		return alien;
	}

	public String getTranslate() {
		return translate;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.alien.equals(obj))
			return true;
		return false;
	}	

	
}
