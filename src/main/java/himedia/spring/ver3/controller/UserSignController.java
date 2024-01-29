package himedia.spring.ver3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserSignController {

	@GetMapping("/signIn")
	public String signin() {
		return "sign/signin";
	}
	
	@GetMapping("/signOut")
	public String main() {
		return "sign/signout";
	}
	
	@GetMapping("/sign/success")
	public String success() {
		return "sign/success";
	}
	
}
