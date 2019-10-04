package com.amazonaws.lambda.demo;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

import com.amazonaws.lambda.demo.RequestDetails;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class HelloTest {

    private static Object input;

    @BeforeClass
    public static void createInput() throws IOException {
        // TODO: set up your sample input object here.
        input = null;
    }

    private Context createContext() {
        TestContext ctx = new TestContext();

        // TODO: customize your context here if needed.
        ctx.setFunctionName("Your Function Name");

        return ctx;
    }
    
    /*test case for Hello.java for testing insertion
     * 
     */

    @Test
    public void testHello() {
        Hello handler = new Hello();
        Context ctx = createContext();
        RequestDetails requestDetails = new RequestDetails();
        
       // RequestDetails requestDetails = new 
        
       // String greetingString = String.format("Hello %s.", requestDetails.getName());

        //String output = handler.handleRequest(requestDetails.getName() , ctx);
        requestDetails.setName("nero");
        handler.handleRequest(requestDetails, ctx);
         
        
      
        

        // TODO: validate output here if needed.
        //Assert.assertEquals("Hello from Lambda!", output);
        
    }
}
