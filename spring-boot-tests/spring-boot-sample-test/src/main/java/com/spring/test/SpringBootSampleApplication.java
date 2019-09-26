package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author zewei.wang
 * @Description
 * @Date 2019/9/26
 **/
@SpringBootApplication
@RestController
public class SpringBootSampleApplication {

	@RequestMapping("/")
	public Object hello(){
		return "hello world";
	}

	public static void main(String[] args){
		SpringApplication.run(SpringBootSampleApplication.class,args);
	}
}
