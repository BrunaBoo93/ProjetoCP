package br.com.unicesumar.modelo;

import br.com.unicesumar.excecao.ExplosaoException;
import br.com.unicesumar.modelo.Campo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTest {
	
	private Campo campo ;
	
	@BeforeEach
	public void iniciarCampo() {

		campo = new Campo(3, 3);
	}
	
	@Test
	public void testVizinhoRealDistancia1() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		Assertions.assertTrue(resultado);
	}

	@Test
	public void testeVizinhoDistancia1Esquerda(){
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		Assertions.assertTrue(resultado);
	}

	@Test
	public void testeVizinhoDistancia1Direita(){
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		Assertions.assertTrue(resultado);
	}

	@Test
	public void testeVizinhoDistancia1EmCima(){
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		Assertions.assertTrue(resultado);
	}

	@Test
	public void testeVizinhoDistancia1EmBaixo(){
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		Assertions.assertTrue(resultado);
	}

	@Test
	public void testeNaoVizinho(){
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		Assertions.assertFalse(resultado);
	}

	@Test
	public void testeValorPadraoAtributoMarcado(){
		Assertions.assertFalse(campo.isMarcado());
	}

	@Test
	public void testeAlternarMarcacao(){
		campo.alternarMarcacao();
		Assertions.assertTrue(campo.isMarcado());
	}

	@Test
	public void testeAlternarMarcacaoDuasChamadas(){
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		Assertions.assertFalse(campo.isMarcado());
	}

	@Test
	public void testeAbrirNaoMinadoNaoMarcado(){
		Assertions.assertTrue(campo.abrir());
	}

	@Test
	public void testeAbrirNaoMinadoMarcado(){
		campo.alternarMarcacao();
		Assertions.assertFalse(campo.abrir());
	}

	@Test
	public void testeAbrirMinadoMarcado(){
		campo.alternarMarcacao();
		campo.minar();
		Assertions.assertFalse(campo.abrir());
	}

	@Test
	public void testeAbrirMinadoNaoMarcado(){
		campo.minar();

		Assertions.assertThrows(ExplosaoException.class, () ->{
			campo.abrir();
		});
	}

	@Test
	public void testeAbrirComVizinhos(){
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);

		campo.adicionarVizinho(campo22);
		campo.abrir();

		Assertions.assertTrue(campo22.isAberto() && campo11.isAberto());
	}





}
