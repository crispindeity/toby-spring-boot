package tobyspring.tobyspringboot.config.autoconfig;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import tobyspring.tobyspringboot.config.MyAutoConfiguration;

@MyAutoConfiguration
public class JettyWebServerConfig {
    @Bean(name = "jettyWebServerFactory")
    public ServletWebServerFactory servletWebServerFactory() {
        return new JettyServletWebServerFactory();
    }
}
