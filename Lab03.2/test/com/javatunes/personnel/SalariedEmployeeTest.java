package com.javatunes.personnel;

import static org.junit.Assert.*;

import gov.irs.TaxPayer;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;

public class SalariedEmployeeTest {
  private SalariedEmployee emp;

  @Before
  public void setUp() throws Exception {
    emp = new SalariedEmployee("Hobak", new Date(0), 50000.00);
  }

  @Test
  public void pay() {
    assertEquals(50000.00, emp.pay(), 0.005);
  }

  @Test
  public void payTaxes() {
    assertEquals(50000 * TaxPayer.SALARIED_TAX_RATE, emp.payTaxes(), 0.005);
  }
}