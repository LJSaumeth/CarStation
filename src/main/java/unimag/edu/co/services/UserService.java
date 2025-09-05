package unimag.edu.co.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unimag.edu.co.model.User;
import unimag.edu.co.repository.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Transactional
	public List<User> saveAllUsers(List<User> users){
		return userRepository.saveAll(users);
	} 
	
	public User findUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public List<User> findAllUsers(){
		return userRepository.findAll();
	}
	
	@Transactional
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		userRepository.flush();
	}
	
	@Transactional
	public void deleteAllUsers() {
		userRepository.deleteAll();
		userRepository.flush();
	}
}
