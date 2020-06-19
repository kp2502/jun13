/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.myjunitemployee.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Krimali
 */
public class EmployeeTest {
    Employee employee;

    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void setUp() {
        employee = new Employee();
        System.out.println("setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
      public void testEmployeeFirstname() {
      employee.setFirstname("Krimali");
        assertEquals("Krimali",employee.getFirstname());
              
}
       @Test
        public void testEmployeeLastname() {
        employee.setLastname("Parikh");
         System.out.println("lastname="+employee.getLastname());
         assertEquals("Parikh",employee.getLastname());
        }
}