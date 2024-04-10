package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@SpringBootApplication
public class DemoApplication {

	public static void main(java.lang.String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
