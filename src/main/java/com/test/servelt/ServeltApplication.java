package com.test.servelt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿을 스캔하기 위한 어노테이션
@SpringBootApplication
public class ServeltApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeltApplication.class, args);
	}

}
