package com.github.nagaseyasuhito.hypericum.resource;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.github.nagaseyasuhito.hypericum.Result;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

@RunWith(Arquillian.class)
public class TokenizeResourceIT {

	@Deployment
	public static Archive<?> createDeployment() {
		WebArchive war = ShrinkWrap.create(WebArchive.class);
		war.addPackages(true, "com.github.nagaseyasuhito.hypericum");
		war.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
		return war;
	}

	@Inject
	private TokenizeResource tokenizeResource;

	@Test
	public void tokenizeSuccess() {
		Result result = this.tokenizeResource.tokenize("本日は晴天なり");

		assertThat(result.getQuery(), is("本日は晴天なり"));
		assertThat(result.getTokens().size(), is(4));
	}
}
