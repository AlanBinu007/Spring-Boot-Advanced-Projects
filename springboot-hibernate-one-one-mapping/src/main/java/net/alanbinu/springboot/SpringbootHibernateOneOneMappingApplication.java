package net.alanbinu.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.alanbinu.springboot.entity.Gender;
import net.alanbinu.springboot.entity.User;
import net.alanbinu.springboot.entity.UserProfile;
import net.alanbinu.springboot.repository.UserProfileRepository;
import net.alanbinu.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// user object
		User user = new User();
		user.setName("Ramesh");
		user.setEmail("ramesh@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthOfDate(LocalDate.of(1991, 03, 24));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567899");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
