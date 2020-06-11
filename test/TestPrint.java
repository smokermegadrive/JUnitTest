/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import quickshittyproject.PrintClass;

/**
 *
 * @author Smoker
 */
public class TestPrint {
    
    
    @Test
    public void printTest() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        PrintClass pc = new PrintClass();
        pc.textito();
        assertEquals("TIME EXTENSION", outContent.toString());
    }
}
