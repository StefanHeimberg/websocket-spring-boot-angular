package ch.stefanheimberg.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.web.socket.EnableWebSocketSecurity;
import org.springframework.security.messaging.access.intercept.MessageMatcherDelegatingAuthorizationManager;

@EnableWebSocketSecurity
@Configuration
public class WebSocketSecurityConfig {

    @Bean
    public AuthorizationManager<?> authorizationManager(final MessageMatcherDelegatingAuthorizationManager.Builder messages) {
        // allow any message
        messages.anyMessage().permitAll();

        return messages.build();
    }

    @Bean("csrfChannelInterceptor")
    public ChannelInterceptor noopCsrfChannelInterceptor() {
        // disable XorCsrfChannelInterceptor
        return new ChannelInterceptor() {};
    }

}
