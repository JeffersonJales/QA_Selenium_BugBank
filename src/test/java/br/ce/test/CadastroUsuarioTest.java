package br.ce.test;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/cadastro_usuario.feature",
		glue = "br.ce.steps",
		snippets = CAMELCASE,
		stepNotifications = true,
		dryRun = false
)

public class CadastroUsuarioTest {

}
