package com.yash.aws.snsdemo;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.SubscribeRequest;

public class SubscribeTopicApp {
	public static void main(String[] args) {
		// Set credentials
    	System.out.println("Setting credentials...");
    	AWSCredentials credentials = new BasicAWSCredentials(
    			"<AWS Access Key>",
    			"<AWS Secret Key>");
    	
    	// Create client
    	AmazonSNS snsClient = AmazonSNSClientBuilder.standard()
    			.withCredentials(new AWSStaticCredentialsProvider(credentials))
  			  	.withRegion(Regions.US_EAST_1)
  			  	.build();
    	
    	// Subscribe to topic
    	SubscribeRequest subscribeRequest = new SubscribeRequest()
    			.withEndpoint("<user email>")
    			.withProtocol("email")
    			.withTopicArn("<Topic ARN>");
    	
    	snsClient.subscribe(subscribeRequest);
	}
}
