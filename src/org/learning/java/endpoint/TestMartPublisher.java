package org.learning.java.endpoint;

import javax.xml.ws.Endpoint;

import org.learning.java.ProductCatalog;

public class TestMartPublisher {
	
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
