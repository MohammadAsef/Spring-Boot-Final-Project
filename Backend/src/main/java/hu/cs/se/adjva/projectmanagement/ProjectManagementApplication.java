package hu.cs.se.adjva.projectmanagement;
import hu.cs.se.adjva.projectmanagement.Repository.UserRepository;
import hu.cs.se.adjva.projectmanagement.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ProjectManagementApplication implements CommandLineRunner {

//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
		
	}


    @Override
    public void run(String... args) throws Exception {


//        User user1 = new User("admin1",bCryptPasswordEncoder.encode("admin"),"kabul","07896543243");
//
//        userRepository.save(user1);



    }
}
