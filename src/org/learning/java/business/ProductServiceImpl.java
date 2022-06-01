package org.learning.java.business;

import java.util.ArrayList;
import java.util.List;

import org.learning.java.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Think Like A Monk");
		bookList.add("5 AM Club");
		
		musicList.add("Random");
		musicList.add("MooseTape");
		musicList.add("Last Ride");
		
		movieList.add("Batman");
		movieList.add("Joyland");
		movieList.add("Django Unchained");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java Brains Book", "1234", 999.99));
		productList.add(new Product("Android Book", "4567", 48.99));
		return productList;
	}
	
}
