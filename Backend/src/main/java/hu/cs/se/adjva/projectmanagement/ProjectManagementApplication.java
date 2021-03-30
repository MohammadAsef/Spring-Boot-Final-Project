package hu.cs.se.adjva.projectmanagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import hu.cs.se.adjva.projectmanagement.Repository.UserRepository;
import hu.cs.se.adjva.projectmanagement.model.User;

@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User(1, "admin1", bCryptPasswordEncoder.encode("admin1"));
        userRepository.save(user1);
		User user2 = new User(2, "admin2", bCryptPasswordEncoder.encode("admin2"));
		userRepository.save(user2);

		
	}

}
