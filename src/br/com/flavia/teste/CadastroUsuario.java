package br.com.flavia.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroUsuario {

	@Test

	public void adicionarUmUsuario() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASUS\\Documents\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/usuarios/new");

		WebElement nome = driver.findElement(By.name("usuario.nome"));
		WebElement email = driver.findElement(By.name("usuario.email"));

		nome.sendKeys("João da Silva");
		email.sendKeys("joao.silva@gmail.com");

		WebElement botaoSalvar = driver.findElement(By.id("btnSalvar"));
		botaoSalvar.click();

		/*
		 * obs: submit() realiza a mesma ação do click() nome.submit(); email.submit();
		 * é preciso garantir que Eduardoi foi adicionado. Verde=OK, vermelho=falha.
		 */

		boolean achouNome = driver.getPageSource().contains("João da Silva");
		boolean achouEmail = driver.getPageSource().contains("joao.silva@gmail.com");

		assertTrue(achouNome);
		assertTrue(achouEmail);

		driver.close();

	}
}