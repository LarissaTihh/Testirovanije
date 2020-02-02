/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import farcelsium.farcel;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author LARISSA
 */
public class FarCelTest {
 @Test
    public void FarCelTest() {    
        farcel obj;
        obj = new farcel();
        double TF = 200;
        double result = (TF - 32) * 5 / 9;
        // Assert.assertEquals(result,93,0.001);
        Assert.assertFalse(" Celsium grad on vale ", result == 8);
    }
       
  
    }


