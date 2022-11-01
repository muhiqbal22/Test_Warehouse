/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.Admin;

/**
 *
 * @author miqba
 */
public class DAOadminTest {
    
    public DAOadminTest() {
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
    
  }


    /**
     * Test of getBy method, of class DAOadmin.
     */
    @Test
    public void testGetBy() {
        System.out.println("Test Login");
        String uEmail = "iqbal@gmail.com";
        String uPass = "iqbal";
        int empty = 0;
        DAOadmin instance = new DAOadmin();
        List<Admin> result = instance.getBy(uEmail, uPass);
        assertThat(result.toArray().length, is(not(equalTo(empty))));
    }

    /**
     * Test of add_admin method, of class DAOadmin.
     */
    @Test
    public void testAdd_admin() {
        System.out.println("Test Register");
        Admin user = new Admin();
        
        user.setEmail("adadadadada@gmail.com");
        user.setName("adadadadada");
        user.setPassword("adadaddadad");
        
        DAOadmin instance = new DAOadmin();
        String expResult = "index";
        String result = instance.add_admin(user);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
