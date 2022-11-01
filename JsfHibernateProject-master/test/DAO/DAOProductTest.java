/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Product;
import pojo.Product;
import pojo.wareHouseUtil;

/**
 *
 * @author miqba
 */
public class DAOProductTest {
    
    public DAOProductTest() {
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
     * Test of retrveTblproduct method, of class DAOProduct.
     */
    @Test
    public void testRetrveTblproduct() {
        System.out.println("Test List Product");
        DAOProduct instance = new DAOProduct();
        List<Product> result = instance.retrveTblproduct();
        System.out.println("Total Product: " + result.toArray().length);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getbyID method, of class DAOProduct.
     */
    @Test
    public void testGetbyID() {
      System.out.println("Test Search by ID");
      String idProduct = "50";
      DAOProduct instance = new DAOProduct();
      List<Product> result = instance.getbyID(idProduct);
      assertFalse(result.isEmpty());
    }

    /**
     * Test of addProduct method, of class DAOProduct.
     */
    @Test
    public void testAddProduct() {
        System.out.println("Test Add Product");
    
        Product product = new Product();
        product.setName("Sampoerna Mild");
        product.setCategory("Cigarette");
        product.setSupplier("Tembakau Indo");
        product.setStock(52);
    
        DAOProduct instance = new DAOProduct();
        instance.addProduct(product);
    
        assertNotNull(product);
    }

    /**
     * Test of deleteUser method, of class DAOProduct.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("Test Delete Product");
        Integer idProduct = 23;
        DAOProduct instance = new DAOProduct(); 
        Transaction transaction = null;
        Session session = wareHouseUtil.getSessionFactory().openSession();
    
        transaction = session.beginTransaction();
        instance.deleteUser(idProduct);
        transaction.commit();
    
        Product deletedProduct = (Product) session.get(Product.class, idProduct);
        assertNull(deletedProduct);
    }

    /**
     * Test of editUser method, of class DAOProduct.
     */
    @Test
    public void testEditUser() {
        System.out.println("Test Update Product");
    
        DAOProduct instance = new DAOProduct();
        Transaction transaction = null;
        Session session = wareHouseUtil.getSessionFactory().openSession();
    
        Integer id = 51;
        Product product = new Product();
        product.setId(id);
        product.setName("Saos Tomat ABC");
        product.setCategory("Makanan");
        product.setSupplier("Alfamager");
        product.setStock(66);
    
        transaction = session.beginTransaction();
        instance.editUser(product);
        transaction.commit();
    
        Product updatedProduct = (Product) session.get(Product.class, id);
    
        String expResult = "Saos Tomat ABC";
        String result = updatedProduct.getName();
    
        assertEquals(expResult, result);
    }
    
}
