package com.yash.aws.snsdemo;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;

/**
 * Hello world!
 */
public class CreateTopicApp 
{
    public static void main( String[] args )
    {
    	// Set credentials
    	System.out.println("Setting credentials...");
    	AWSCredentials credentials = new BasicAWSCredentials(
    			"AKIAIOONANTKZRWD7E2A",
    			"5L+lN/c6AumIQ2VKbaoBlg2qYPGeFInox/1aBKPn");
    }
}
