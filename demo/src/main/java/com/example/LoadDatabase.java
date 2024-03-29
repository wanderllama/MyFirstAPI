package com.example;

import com.example.Employee;
import com.example.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("preloading " + repository.save(new Employee("Siam" , "Java instructor")));
            log.info("preloading " + repository.save(new Employee("Nadir" , "Soft Skills instructor")));
            log.info("preloading " + repository.save(new Employee("Aysun" , "Selenium instructor")));
            log.info("preloading " + repository.save(new Employee("Mehmet" , "Database instructor")));
            log.info("preloading " + repository.save(new Employee("Murodil" , "API instructor")));
            log.info("preloading " + repository.save(new Employee("Austin" , "Support for everything")));
            log.info("preloading " + repository.save(new Employee("James Wallace" , "SDET")));
        };
    }
}
