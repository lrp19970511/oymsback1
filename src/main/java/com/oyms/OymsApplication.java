package com.oyms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.oyms.mapper")
public class OymsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OymsApplication.class, args);
	}

}
