package com.LinktoSync.Backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure()
                              .directory("/home/prasanth/Desktop/Backend")
                              .load();

        System.setProperty("DB_URL", dotenv.get("DB_URL"));
        System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		System.setProperty("APP_USERNAME", dotenv.get("APP_USERNAME"));
		System.setProperty("APP_PASSWORD", dotenv.get("APP_PASSWORD"));

        SpringApplication.run(BackendApplication.class, args);
    }
}
