package com.github.nagaseyasuhito.hypericum;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Token {

	private String reading;
	private String surfaceForm;
	private String allFeatures;

	public Token(org.atilika.kuromoji.Token token) {
		this.reading = token.getReading();
		this.surfaceForm = token.getSurfaceForm();
		this.allFeatures = token.getAllFeatures();
	}
}
