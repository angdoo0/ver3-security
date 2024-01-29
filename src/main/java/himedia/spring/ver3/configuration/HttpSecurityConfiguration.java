package himedia.spring.ver3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class HttpSecurityConfiguration {
	@Bean
	protected SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf((csrf) -> csrf.disable())
			.authorizeHttpRequests((authorizeRequest)-> 
				authorizeRequest
				.requestMatchers("/", "/signIn", "/signOut").permitAll()
				.anyRequest().authenticated()
				)
		
		.formLogin(formLogin -> 
				formLogin
					.loginPage("/signin")
					.defaultSuccessUrl("/sign/success", true)
					.failureUrl("/signIn?error=true")
					.usernameParameter("username")
					.passwordParameter("password")	
					.loginProcessingUrl("/signIn")
				);
		
		http.logout(logout -> logout
					.logoutUrl("/logOut")
					.invalidateHttpSession(true)
					.logoutSuccessUrl("/signOut")
				);
		
		return http.build();
	}
	
}
