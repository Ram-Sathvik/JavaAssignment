package springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.models.Product;
import springboot.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}
	
	@PostMapping
	public void createProduct(@RequestBody Product product) {
		productService.createProduct(product);
	}
	
	@PutMapping("/{id}")
	public void updateProductById(@PathVariable int id, @RequestBody Product product) {
		productService.updateProductById(id, product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProductById(@PathVariable int id) {
		productService.deleteProductById(id);
	}
}