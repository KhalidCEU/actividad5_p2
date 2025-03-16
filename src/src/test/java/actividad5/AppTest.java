package actividad5;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{

    /**
     * Test sumaHastaN
     */
    public void testSumaHastaN() {
        assertEquals(0, Mates.sumaHastaN(0));
        assertEquals(1, Mates.sumaHastaN(1));
        assertEquals(15, Mates.sumaHastaN(5));
        assertEquals(55, Mates.sumaHastaN(10));
    }

    /**
     * Test sumaHastaN
     */
    public void testFactorial() {
        assertEquals(1, Mates.factorial(1));
        assertEquals(6, Mates.factorial(3));
        assertEquals(120, Mates.factorial(5));
    }

    /**
     * Test potencia
    */
    public void testPotencia() {
        assertEquals(1, Mates.potencia(5, 0));
        assertEquals(1, Mates.potencia(0, 0));
        assertEquals(8, Mates.potencia(2, 3));
        assertEquals(-8, Mates.potencia(-2, 3));
    }

    /**
     * Test sumaElementosLista
     */
    public void testSumaElementosLista() {
        int[] listaVacia = {};
        assertEquals(0, Mates.sumaElementosLista(listaVacia, 0));

        int[] lista1 = {5};
        assertEquals(5, Mates.sumaElementosLista(lista1, 0));

        int[] lista2 = {1, 2, 3, 4, 5};
        assertEquals(15, Mates.sumaElementosLista(lista2, 0));

        int[] lista3 = {-1, -2, -3, -4, -5};
        assertEquals(-15, Mates.sumaElementosLista(lista3, 0));
    }

    /**
     * Test mediaElementosLista
     */
    public void testMediaElementosLista() {
        int[] listaVacia = {};
        assertEquals(0, Mates.mediaElementosLista(listaVacia, 0, listaVacia.length), 0.001);

        int[] lista1 = {5};
        assertEquals(5, Mates.mediaElementosLista(lista1, 0, lista1.length), 0.001);

        int[] lista2 = {1, 2, 3, 4, 5};
        assertEquals(3, Mates.mediaElementosLista(lista2, 0, lista2.length), 0.001);

        int[] lista3 = {-1, -2, -3, -4, -5};
        assertEquals(-3, Mates.mediaElementosLista(lista3, 0, lista3.length), 0.001);

        int[] lista4 = {-10, 0, 10, 20, 30};
        assertEquals(10, Mates.mediaElementosLista(lista4, 0, lista4.length), 0.001);
    }

    /**
     * Test desviacionElementosLista
     */
    public void testDesviacionElementosLista() {
        int[] lista1 = {5};
        double media = Mates.mediaElementosLista(lista1, 0, lista1.length);
        assertEquals(0, Mates.desviacionElementosLista(lista1, media, lista1.length, 0, 0), 0.001);

        int[] lista2 = {2, 4, 4, 4, 5, 5, 7, 9};
        media = Mates.mediaElementosLista(lista2, 0, lista2.length);
        assertEquals(2, Mates.desviacionElementosLista(lista2, media, lista2.length, 0, 0), 0.001);

        int[] lista3 = {-2, -1, 0, 1, 2};
        media = Mates.mediaElementosLista(lista3, 0, lista3.length);
        assertEquals(1.414, Mates.desviacionElementosLista(lista3, media, lista3.length, 0, 0), 0.001);
    }

    /**
     * Test sumaParesHastaN
     */
    public void testSumaParesHastaN() {
        assertEquals(0, Mates.sumaParesHastaN(0));
        assertEquals(0, Mates.sumaParesHastaN(1));
        assertEquals(2, Mates.sumaParesHastaN(2));
        assertEquals(6, Mates.sumaParesHastaN(5));
        assertEquals(30, Mates.sumaParesHastaN(10));
    }

    /**
     * Test sumaParesElementosLista
     */
    public void testSumaParesElementosLista() {
        int[] listaVacia = {};
        assertEquals(0, Mates.sumaParesElementosLista(listaVacia, listaVacia.length, 0));

        int[] listaNumerosImpares = {1, 3, 5, 7};
        assertEquals(0, Mates.sumaParesElementosLista(listaNumerosImpares, listaNumerosImpares.length, 0));

        int[] listaNumerosPares = {2, 4, 6, 8};
        assertEquals(20, Mates.sumaParesElementosLista(listaNumerosPares, listaNumerosPares.length, 0));

        int[] lista1 = {1, 2, 3, 4, 5};
        assertEquals(6, Mates.sumaParesElementosLista(lista1, lista1.length, 0));

        int[] lista2 = {-2, -4, -6};
        assertEquals(-12, Mates.sumaParesElementosLista(lista2, lista2.length, 0));
    }

    /**
     * Test obtenerListaPar
     */
    public void testObtenerListaPar() {
        ArrayList<Integer> arrayListVacio = new ArrayList<>();

        int[] listaVacia = {};
        ArrayList<Integer> resultado = Mates.obtenerListaPar(listaVacia, arrayListVacio, 0);
        assertTrue(resultado.isEmpty());

        int[] listaImpares = {1, 3, 5, 7};
        resultado = Mates.obtenerListaPar(listaImpares, arrayListVacio, 0);
        assertTrue(resultado.isEmpty());

        int[] listaPares = {2, 4, 6, 8};
        resultado = Mates.obtenerListaPar(listaPares, arrayListVacio, 0);
        assertEquals(Arrays.asList(2, 4, 6, 8), resultado);

        int[] lista1 = {1, 2, 3, 4, 5};
        resultado = Mates.obtenerListaPar(lista1, arrayListVacio, 0);
        assertEquals(Arrays.asList(2, 4), resultado);
    }


    /**
     * Test obtenerListaParHastaN
     */
    public void testObtenerListaParHastaN() {
        ArrayList<Integer> arrayListVacio = new ArrayList<>();

        ArrayList<Integer> resultado = Mates.obtenerListaParHastaN(arrayListVacio, 0);
        assertTrue(resultado.isEmpty());

        resultado = Mates.obtenerListaParHastaN(arrayListVacio, 1);
        assertTrue(resultado.isEmpty());

        resultado = Mates.obtenerListaParHastaN(arrayListVacio, 2);
        assertEquals(Arrays.asList(2), resultado);
    }

    /**
     * Test productoEscalarListas
     */
    public void testProductoEscalarListas() {
        int[] listaVacia = {};
        int[] listaVacia2= {};
        assertEquals(0, Mates.productoEscalarListas(listaVacia, listaVacia2, 0, 0));

        int[] lista1 = {3};
        int[] lista2 = {4};
        assertEquals(12, Mates.productoEscalarListas(lista1, lista2, 0, 0));

        int[] lista3 = {1, 2, 3};
        int[] lista4 = {4, 5, 6};
        assertEquals(32, Mates.productoEscalarListas(lista3, lista4, 0, 0));

        int[] listaNegativos = {-1, -2, -3};
        int[] lista5 = {4, 5, 6};
        assertEquals(-32, Mates.productoEscalarListas(listaNegativos, lista5, 0, 0));

        int[] listaCeros = {0, 0, 0};
        int[] lista6 = {1, 2, 3};
        assertEquals(0, Mates.productoEscalarListas(listaCeros, lista6, 0, 0));
    }


}
