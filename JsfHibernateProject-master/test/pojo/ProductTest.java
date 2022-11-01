/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author miqba
 */
public class ProductTest {
    
    public ProductTest() {
    }
    
    @BeforeClass
  public static void setUpClass() {
    System.out.println("***** Start Testing *****");
  }
  
  @AfterClass
  public static void tearDownClass() {
    System.out.println("***** End Testing *****");
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
    System.out.println("\n");
  }

    /**
     * Test of getAllRecords method, of class Product.
     */
@Test
public void testGetAllRecords() {
    System.out.println("Test Get All Record");
    Product instance = new Product();
    int expResult = 19;
    List<Product> result = instance.getAllRecords();
    assertEquals(expResult, result.toArray().length);
        
    }

    /**
     * Test of getById method, of class Product.
     */
@Test
public void testGetById() {
    System.out.println("Test Get by ID");
      
    Product instance = new Product();
    instance.setId(48);
    
    String expResult = "table";
    String result = instance.getById();

    assertEquals(expResult, result);        
    }

    /**
     * Test of saveProduct method, of class Product.
     */
    @Test
    public void testSaveProduct() {
        System.out.println("Test Save Product");
    
        Product instance = new Product();
        instance.setName("Kapal Api");
        instance.setCategory("Minuman");
        instance.setSupplier("Kopi Susu Agent");
        instance.setStock(80);
    
        String expResult = "table";
        String result = instance.saveProduct();

    assertEquals(expResult, result);
    }

    /**
     * Test of editProduct method, of class Product.
     */
    @Test
    public void testEditProduct() {
        System.out.println("editProduct");
        Product instance = new Product();
        instance.setId(20);
        instance.setName("Kopi ABC");
        instance.setCategory("Minuman");
        instance.setSupplier("Kopi Hitam Agent");
        instance.setStock(20);
    
        String expResult = "table";
        String result = instance.editProduct();

        assertEquals(expResult, result);
    }

    /**
     * Test of deleteProduct method, of class Product.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
    
        Product instance = new Product();
        instance.setId(56);
    
        String expResult = "table";
        String result = instance.deleteProduct();
    
        assertEquals(expResult, result);
    }
    
}

   