package ch.stefanheimberg.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception {
        // authorize all
        http.authorizeHttpRequests(authorizeRequests -> {
            authorizeRequests.anyRequest().permitAll();
        });

        // disable csrf
        http.csrf(AbstractHttpConfigurer::disable);


        // disable cors
        http.cors(AbstractHttpConfigurer::disable);

        return http.build();
    }

}
