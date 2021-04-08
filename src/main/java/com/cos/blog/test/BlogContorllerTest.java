package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 //스프링이 com.cos.blog 패키지 이하의 특정 어노테이션이 붙어있는 클래스 파일을 new해서 (IoC) 스프링 컨테이너에 관리해줍니다.
@RestController
public class BlogContorllerTest {
	
	
		//http://localhost:8080/test/hello
		@GetMapping("/test/hello")
		public String hello() {
			return "<h1>hello spring boot</h1>";
		}
}
