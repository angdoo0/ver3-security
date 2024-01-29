package himedia.spring.ver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//SecurityAutoConfiguration을 꺼서 로그인 없이 접속 가능, 개발할때 시큐리티는 모근 웹페이지에 다 필터가 걸리니까 잠시 끔
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)	
@SpringBootApplication
public class Ver3SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ver3SecurityApplication.class, args);
	}

}
