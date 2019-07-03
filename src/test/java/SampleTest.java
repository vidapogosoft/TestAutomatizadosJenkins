//package src.test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import devopstest.operaciones;

public class SampleTest {
	
	
	
	private WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	
	@Test
	public void shouldLoadQA(){
		driver.navigate().to("https://www.youtube.com/user/GlassBoxT");
		String title = driver.getTitle();
		assertTrue(title.contains("QAShahin"));
	}
	
	@Test
	public void cuadradoTest(){
		int a=2;

		int esperado=4;
		operaciones op = new operaciones();
		int resultado=op.cuadrado(a,a);
		assertEquals(esperado,resultado);
		//assertEquals(expected, actual);
	}
	
	@Test
	public void sumarTest(){
		int a=2;
		int b=3;
		int esperado=5;
		operaciones op = new operaciones();
		int resultado=op.sumar(a, b);
		assertEquals(esperado,resultado);
		//assertEquals(expected, actual);
	}
	
	@Test
	public void restarTest(){
		int a=4;
		int b=3;
		int esperado=1;
		operaciones op = new operaciones();
		int resultado=op.restar(a,b);
		assertEquals(esperado,resultado);
	}

	@Test
	public void multiplicarTest(){
		int a=5;
		int b=3;
		int esperado=15;
		operaciones op = new operaciones();
		int resultado=op.multiplicar(a, b);
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void dividirTest(){
		int a=6;
		int b=3;
		int esperado=2;
		operaciones op = new operaciones();
		int resultado=op.dividir(a, b);
		assertEquals(esperado,resultado);
	}
}
