package guru.springframework.springpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.springpetclinic"})
@SpringBootApplication
public class SpringPetclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPetclinicApplication.class, args);
	}

}
