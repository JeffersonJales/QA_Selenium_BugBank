package br.ce.pages;
import org.openqa.selenium.By;

public class LoginPage extends Page{
	
	private By inputLoginEmail = By.xpath("//input[@type='email']");
	private By inputLoginPassword = By.xpath("//input[@type='password']");
	private By btnLogin = By.xpath("//button[@type='submit']");
	private By btnRegister = By.xpath("//button[text()='Registrar']");		
	
	public void login(String email, String password) {
		write(inputLoginEmail, email);
		write(inputLoginPassword, password);
		click(btnLogin);
	}
	
	public void register() {
		click(btnRegister);
	}
}
