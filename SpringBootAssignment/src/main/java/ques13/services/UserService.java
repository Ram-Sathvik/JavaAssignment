package ques13.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ques13.models.User;
import ques13.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User ID " + id + " not found"));
	}

	public void createUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(int id, User user) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User ID " + id + " not found"));
		
		existingUser.setName(user.getName());
		existingUser.setAge(user.getAge());
		existingUser.setSalary(user.getSalary());
		
		userRepository.save(existingUser);
	}

	public void deleteUserById(int id) {
		User existingUser = userRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("User ID " + id + " not found"));
		
		userRepository.deleteById(existingUser.getId());
	}
}