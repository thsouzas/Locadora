/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cliente
 */
public class DVDTest {
    
    public DVDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigo method, of class DVD.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        DVD instance = new DVD();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class DVD.
     */
    @Test
    public void testSetCodigo_int() {
        System.out.println("setCodigo");
        int codigo = 0;
        DVD instance = new DVD();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCod_filme method, of class DVD.
     */
    @Test
    public void testGetCod_filme() {
        System.out.println("getCod_filme");
        DVD instance = new DVD();
        int expResult = 0;
        int result = instance.getCod_filme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCod_filme method, of class DVD.
     */
    @Test
    public void testSetCod_filme() {
        System.out.println("setCod_filme");
        int cod_filme = 0;
        DVD instance = new DVD();
        instance.setCod_filme(cod_filme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSituacao method, of class DVD.
     */
    @Test
    public void testGetSituacao() {
        System.out.println("getSituacao");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getSituacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSituacao method, of class DVD.
     */
    @Test
    public void testSetSituacao() {
        System.out.println("setSituacao");
        String situacao = "";
        DVD instance = new DVD();
        instance.setSituacao(situacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class DVD.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        DVD instance = new DVD();
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class DVD.
     */
    @Test
    public void testSetPreco_double() {
        System.out.println("setPreco");
        double preco = 0.0;
        DVD instance = new DVD();
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData_compra method, of class DVD.
     */
    @Test
    public void testGetData_compra() {
        System.out.println("getData_compra");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getData_compra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData_compra method, of class DVD.
     */
    @Test
    public void testSetData_compra() {
        System.out.println("setData_compra");
        String data_compra = "";
        DVD instance = new DVD();
        instance.setData_compra(data_compra);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilme method, of class DVD.
     */
    @Test
    public void testGetFilme() {
        System.out.println("getFilme");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getFilme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class DVD.
     */
    @Test
    public void testSetCodigo_String() {
        System.out.println("setCodigo");
        String codigo = "";
        DVD instance = new DVD();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreco method, of class DVD.
     */
    @Test
    public void testSetPreco_String() {
        System.out.println("setPreco");
        String preco = "";
        DVD instance = new DVD();
        instance.setPreco(preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilme method, of class DVD.
     */
    @Test
    public void testSetFilme() {
        System.out.println("setFilme");
        String filme = "";
        DVD instance = new DVD();
        instance.setFilme(filme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class DVD.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        DVD instance = new DVD();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class DVD.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class DVD.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCEP method, of class DVD.
     */
    @Test
    public void testGetCEP() {
        System.out.println("getCEP");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getCEP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class DVD.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class DVD.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        DVD instance = new DVD();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class DVD.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        DVD instance = new DVD();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigoCompra method, of class DVD.
     */
    @Test
    public void testGetCodigoCompra() {
        System.out.println("getCodigoCompra");
        DVD instance = new DVD();
        Object expResult = null;
        Object result = instance.getCodigoCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
