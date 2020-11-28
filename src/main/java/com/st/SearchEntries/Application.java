package com.st.SearchEntries;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.st")
//@ImportResource("classpath:applicationContext.xml")
public class Application {
public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
}
}