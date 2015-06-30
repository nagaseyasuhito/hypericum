package com.github.nagaseyasuhito.hypericum.service;

import java.util.List;
import java.util.stream.Collectors;

import org.atilika.kuromoji.Tokenizer;

import com.github.nagaseyasuhito.hypericum.Result;
import com.github.nagaseyasuhito.hypericum.Token;

public class TokenizeService {

	private Tokenizer tokenizer = Tokenizer.builder().build();

	public Result tokenize(String query) {
		List<Token> tokens = this.tokenizer.tokenize(query).stream().map(Token::new).collect(Collectors.toList());

		return new Result(query, tokens);
	}
}
