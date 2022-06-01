package org.learning.java;

import java.util.List;

import javax.jws.WebService;
import org.learning.java.business.ProductServiceImpl;
import org.learning.java.model.Product;

/*
 * We can still annotate public methods with @WebMethod annotation, but
 * Every public method in WebService is by-default act as a WebMethod.
 */


/*
 * To override the WSDL element names, we can use below arguments to the annotation.
 * 
 * @WebService(name = "TestmartCatalog", portName = "TestmartCatalogPort", 
				serviceName = "TestmartCatalogService", targetNamespace = "www.testmart.com")
 */

//@WebService

@WebService(endpointInterface = "org.learning.java.ProductCatalogInterface", 
				portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	@Override
	//@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	//@WebMethod(exclude=true)	// to exclude the method/operation from WSDL WebService
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@Override
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
	
	
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}
}
