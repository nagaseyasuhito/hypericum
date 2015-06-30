package com.github.nagaseyasuhito.hypericum.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.github.nagaseyasuhito.hypericum.Result;
import com.github.nagaseyasuhito.hypericum.service.TokenizeService;

@Path("tokenize")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TokenizeResource {

	@Inject
	private TokenizeService tokenizeService;

	@GET
	public Result tokenize(@QueryParam("query") String query) {
		return this.tokenizeService.tokenize(query);
	}
}
