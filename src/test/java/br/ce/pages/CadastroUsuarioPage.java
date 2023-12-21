package br.ce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CadastroUsuarioPage extends Page{
	
	private By inputEmail = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input");
	private By inputPassword = By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input");
	
	private By inputName = By.xpath("//input[@type='name']");
	private By inputConfirmPassword = By.xpath("//input[@name='passwordConfirmation']");
	       
	private By btnRegister = By.cssSelector("#__next > div > div.pages__FormBackground-sc-1ee1f2s-2.jNpkvU > div > div.card__register > form > button");
	private By btnAccountBallance = By.id("toggleAddBalance");
	       
	private By textConfirmAccount = By.id("modalText");
	private By btnConfirmAccount = By.id("btnCloseModal");
		
	public void cadastrar(String email, String name, String password, String confirmPassword, boolean withBallance) throws InterruptedException {
		write(inputEmail, email);
		write(inputName, name);
		write(inputPassword, password);
		write(inputConfirmPassword, confirmPassword);
		
		if(withBallance)
			click(btnAccountBallance);
		
		click(btnRegister);
	}
	
	public String obterTextoConfirmacao() {
		return read(textConfirmAccount);
	}

	public By getTextConfirmAccount() {
		return textConfirmAccount;
	}
	
	
}
