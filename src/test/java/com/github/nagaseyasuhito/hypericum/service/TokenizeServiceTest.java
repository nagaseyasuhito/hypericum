package com.github.nagaseyasuhito.hypericum.service;

import org.junit.Test;

import com.github.nagaseyasuhito.hypericum.Result;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

public class TokenizeServiceTest {

	private TokenizeService tokenizeService = new TokenizeService();

	@Test
	public void tokenizeSuccess() {
		Result result = this.tokenizeService.tokenize("本日は晴天なり");

		assertThat(result.getQuery(), is("本日は晴天なり"));
		assertThat(result.getTokens().size(), is(4));
	}
}
