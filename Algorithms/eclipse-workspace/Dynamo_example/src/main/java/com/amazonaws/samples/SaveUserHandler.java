package com.amazonaws.samples;

import javax.naming.Context;


import com.amazonaws.partitions.model.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;

import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context; 

public class SaveUserHandler implements RequestHandler< UserRequest, UserResponse >{
	
	private DynamoDB dynamoDb;
    private String DYNAMODB_TABLE_NAME = "Users";
    private Regions REGION = Regions.US_EAST_1;
    
    public UserResponse handleRequest(
    		UserRequest userRequest, Context context) {
    	  
    	        this.initDynamoDbClient();
    	 
    	        persistData(userRequest);
    	 
    	        UserResponse userResponse = new UserResponse();
    	        userResponse.setMessage("Saved Successfully!!!");
    	        return userResponse;
    	    }	
    
    private PutItemOutcome persistData(UserRequest userRequest) 
    	      throws ConditionalCheckFailedException {
    	        return this.dynamoDb.getTable(DYNAMODB_TABLE_NAME)
    	          .putItem(
    	            new PutItemSpec().withItem(new Item()
    	              .withString("name", userRequest.getName())));
    	           
    	    }
    	 
    	    private void initDynamoDbClient() {
    	       // AmazonDynamoDBClient client = new AmazonDynamoDBClient();
    	       // client.setRegion(Region.getRegion(REGION));
    	       // this.dynamoDb = new DynamoDB(client);
    	        AmazonDynamoDBClient client = new AmazonDynamoDBClient();
    	        client.setRegion(com.amazonaws.regions.Region.getRegion(REGION));
    	    }
    	 
	

}
