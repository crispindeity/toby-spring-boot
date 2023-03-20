package tobyspring.tobyspringboot.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import tobyspring.tobyspringboot.config.autoconfig.DispatcherServletConfig;
import tobyspring.tobyspringboot.config.autoconfig.TomcatWebServerConfig;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({ DispatcherServletConfig.class, TomcatWebServerConfig.class })
public @interface EnableMyAutoConfiguration {
}
