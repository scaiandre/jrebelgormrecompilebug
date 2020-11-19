package de.scai.jrebelgormrecompilebug

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class )
class JrebelgormrecompilebugApplication {

	static void main(String[] args) {
		SpringApplication.run(JrebelgormrecompilebugApplication, args)
	}

}
