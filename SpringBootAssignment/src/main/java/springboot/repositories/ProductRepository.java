package springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {}