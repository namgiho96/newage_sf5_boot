package com.newage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newage.web.mapper.MemberMapper;


@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	@Autowired MemberMapper mapper;
	public static void main(String[] args) throws Exception {
		System.out.println("-----시작-----데모 컨트롤러 들어");
		SpringApplication.run(Application.class, args);
	}
}
