package br.ce.steps;

import org.junit.Assert;

import br.ce.pageUtils.WebDriverWaitFactory;
import br.ce.pages.CadastroUsuarioPage;
import br.ce.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class CadastroUsuarioSteps {
	private final String emailPadrao = "jalesjefferson@gmail.com";
	private final String nomePadrao = "Jeff";
	private final String senhaPadrao = "123456";
	private final String senhaConfirmadaPadrao = "123456";
	
	private LoginPage loginPage = new LoginPage();
	private CadastroUsuarioPage cadastroPage = new CadastroUsuarioPage();
	
	@Before
	public void pageAcess() {
		loginPage.urlGet();
	}
	
	@After 
	public void pageClose() {
		cadastroPage.urlQuit();
	}
		
	@Dado("que estou na página de cadastro")
	public void queEstouNaPáginaDeCadastro() {
		loginPage.register();
	}
	
	@Quando("informo meus dados válidos")
	public void informoMeusDadosVálidos() throws InterruptedException {
		cadastroPage.cadastrar(emailPadrao, nomePadrao, senhaPadrao, senhaConfirmadaPadrao, false);
	}
	
	@Então("eu vejo que estou cadastrado")
	public void euVejoQueEstouCadastrado() {
		WebDriverWaitFactory.esperarVisibilidade(cadastroPage.getTextConfirmAccount());
		
		String text = cadastroPage.obterTextoConfirmacao();
		System.out.println("Texto" + text);
		boolean text1 = text.contains("A conta");
		boolean text2 = text.contains("foi criada com sucesso");
		Assert.assertTrue(text1 && text2);
	}
}
