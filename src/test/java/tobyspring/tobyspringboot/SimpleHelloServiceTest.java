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
}