package tobyspring.tobyspringboot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class HelloControllerTest {
    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String result = helloController.hello("Test");

        assertThat(result).isEqualTo("Test");
    }

    @ParameterizedTest(name = "#{index} - Run test with args: {0}")
    @NullSource
    @ValueSource(strings = {"", " "})
    void test_not_null(String arg) {
        HelloController helloController = new HelloController(name -> name);

        assertThatThrownBy(() -> {
            helloController.hello(arg);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
