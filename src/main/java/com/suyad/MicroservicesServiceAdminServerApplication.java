package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroservicesServiceAdminServerApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesServiceAdminServerApplication.class, args);
		System.out.println("Admin Server has been started Successfully.................");
	}

}
