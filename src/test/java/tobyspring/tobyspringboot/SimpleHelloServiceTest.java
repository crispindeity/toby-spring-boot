package tobyspring.tobyspringboot;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest {

}

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.ANNOTATION_TYPE })
@Test
@interface UnitTest {

}
class SimpleHelloServiceTest {
    @FastUnitTest
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String result = helloService.sayHello("Test");

        assertThat(result).isEqualTo("Hello Test");
    }

    @FastUnitTest
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        String result = decorator.sayHello("Test");

        assertThat(result).isEqualTo("*Test*");
    }
}