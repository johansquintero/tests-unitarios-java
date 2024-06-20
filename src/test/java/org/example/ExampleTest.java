package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {
    /*
    Given - dado
    When - cuando
    Then - entonces

    assertEquals(expected,actual) //evaluar un valor esperado con uno actual
    assertTrue(condicion) //valida un booleano y siempre espera verdaderos
    assertFalse(condicion) //valida un booleano y siempre espera falsos
    assertNotNull(result) //valida que siempre el resultado no sea nulo
    assertInstanceOf(Integer.class, actual) //valida y evalua el tipo de objeto
    assertThrows(); //valida excepciones
    */

    private Example example;

    @BeforeEach
    void setUp() {
        example = new Example(); // Inicializa la instancia antes de cada prueba
    }


    @Test
    public void testSumar(){
        //Given - dado
        int a = 3;
        int b = 3;
        //When - cuando
        int result = example.sumar(a,b);
        //Then - entonces
        assertEquals(6,result);
        assertInstanceOf(Integer.class,result);
        //assertNotNull(result);
    }


    @Test
    public void testCheckPositivo(){
        //Given - dado
        int n = 4;
        //When - cuando
        boolean q = example.checkPositivo(n);
        //Then - entonces
        assertTrue(q);
    }
    @Test
    public void testCheckPositivoError(){
        //Given - dado
        int n = -4;
        //when-then
        assertThrows(IllegalArgumentException.class,()->{
            example.checkPositivo(n);
        });
    }

    @Test
    public void testContarLetrasA(){
        //Given - dado
        String cadena = "holamundodelplanetatierra";
        //When - cuando
        int conteo = example.contarLetrasA(cadena);
        //Then - entonces
        //assertNotNull(conteo);

        assertEquals(4,conteo);
    }

    @Test
    public void testContieneElementoTrue(){
        //given
        List<String> lista = List.of("pamplona","cucuta","pamplonita","bucaramanga");
        String elemento = "pamplona";
        //when
        boolean q = this.example.contieneElemento(lista,elemento);
        //then
        assertTrue(q);
    }

    @Test
    public void testRevertirCadena(){
        // Given
        String cadena = "carro"; // orrac

        // When
        String result = this.example.revertirCadena(cadena);

        // Then
        assertEquals("orrac", result);
    }

    @Test
    public void testFactorial(){
        //give
        int n = 6;
        //when
        long factorial = this.example.factorial(n);
        //then
        long expected = 720;
        assertEquals(expected,factorial);
    }
    @Test
    public void testFactorialError(){
        // Given
        int number = -6;

        // When - Then
        assertThrows(IllegalArgumentException.class, () -> this.example.factorial(number));
    }

    @Test
    public void testEsPrimo(){
        //given
        int n = 3;
        //when
        boolean result = this.example.esPrimo(n);
        //then
        assertTrue(result);
    }

    @Test
    public void testEsPrimoMoreThanFour(){
        //given
        int n = 7;
        //when
        boolean result = this.example.esPrimo(n);
        //then
        assertTrue(result);
    }

    @Test
    public void testNoEsPrimo(){
        //given
        int n = 10;
        //when
        boolean result = this.example.esPrimo(n);
        //then
        assertFalse(result);
    }
    @Test
    public void testEsPrimoLessAndEqualThanOne(){
        //given
        int n = 1;
        //when
        boolean result = this.example.esPrimo(n);
        //then
        assertFalse(result);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //given-when
        String result = this.example.mensajeConRetraso();
        //then
        assertEquals("Listo después de retraso",result);
    }

    @Test
    public void testConvertirAString(){
        //give
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,2323,5235,12312);
        //when
        List<String> result = this.example.convertirAString(numeros);
        //then
        assertEquals(List.of("1","2","3","4","5","6","7","2323","5235","12312"),result);
    }

    @Test
    public void TestCalcularMedia(){
        List<Integer> lista = List.of(50,10,15,25);
        double result = this.example.calcularMedia(lista);
        assertEquals(25,result);
    }

    @Test
    public void TestCalcularMediaErrorEmpty(){
        List<Integer> lista = List.of();
        assertThrows(IllegalArgumentException.class,()->{
            this.example.calcularMedia(lista);
        });
    }
    @Test
    public void TestCalcularMediaErrorNull(){
        List<Integer> lista = null;
        assertThrows(IllegalArgumentException.class,()->{
            this.example.calcularMedia(lista);
        });
    }
    @Test
    public void TestConvertirListaAString(){
        List<String> lista = List.of("HO","LA"," ","MUN","DO");
        String result = this.example.convertirListaAString(lista);
        assertEquals("HOLA MUNDO",result);
    }

}
