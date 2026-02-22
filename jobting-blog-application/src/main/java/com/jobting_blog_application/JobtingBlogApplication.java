package com.jobting_blog_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.jobting_blog_application", // 애플리케이션 패키지
		"com.jobting_blog_service"      // 서비스 모듈 패키지
})
public class JobtingBlogApplication  {

	public static void main(String[] args) {
		SpringApplication.run(JobtingBlogApplication.class, args);
	}

}