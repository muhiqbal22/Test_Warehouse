/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

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
public class AdminTest {
    
    public AdminTest() {
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
     * Test of save_admin method, of class Admin.
     */
    @Test
    public void testSave_admin() {
        System.out.println("Test Save Admin");
        
        Admin instance = new Admin();  
        instance.setEmail("SuleA@gmail.com");
        instance.setName("SuleA");
        instance.setPassword("123");
        String expResult = "index";
        String result = instance.save_admin();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of login_admin method, of class Admin.
     */
    @Test
    public void testLogin_admin() {
        System.out.println("Test Login Admin");
        Admin instance = new Admin();
        instance.setEmail("iqbal@gmail.com");
        instance.setPassword("iqbal");
        String expResult = "loginSukses";
        String result = instance.login_admin();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}