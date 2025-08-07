package springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.models.Product;
import springboot.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		return productRepository.findById(id)
			    .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
	}

	public void createProduct(Product product) {
		productRepository.save(product);
	}
	
	public void updateProductById(int id, Product product) {
		Product existingProduct = productRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		
		existingProduct.setName(product.getName());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setPrice(product.getPrice());
		productRepository.save(existingProduct);
	}

	public void deleteProductById(int id) {
		Product existingProduct = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		
		productRepository.deleteById(existingProduct.getId());
	}
}