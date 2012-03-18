package br.com.camilolopes.creator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.camilolopes.classes.impl.PessoaFisica;
import br.com.camilolopes.classes.impl.PessoaJuridica;
import br.com.camilolopes.creator.CreatorEnvio;

public class CreatorEnvioTest {

	private CreatorEnvio creatorEnvio;

	@Before
	public void setUp() throws Exception {
		creatorEnvio = new CreatorEnvio();
	}

	@Test
	public void testGetPessoaFisica() {
		assertTrue(creatorEnvio.getEnvio(new PessoaFisica()) instanceof PessoaFisica);
	}

	@Test
	public void testGetPessoaJuridica() {
		assertTrue(creatorEnvio.getEnvio(new PessoaJuridica()) instanceof PessoaJuridica);
	}

	@Test(expected = NullPointerException.class)
	public void testNullIsInvalid() {
		creatorEnvio.getEnvio(null);
	}
}
