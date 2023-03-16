package tobyspring.tobyspringboot;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class SimpleHelloServiceTest {
    @Test
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String result = helloService.sayHello("Test");

        assertThat(result).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        String result = decorator.sayHello("Test");

        assertThat(result).isEqualTo("*Test*");
    }
}