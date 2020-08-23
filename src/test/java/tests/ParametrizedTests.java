package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParametrizedTests {
    static Logger logger = LoggerFactory.getLogger(ParametrizedTests.class);

    @Tag("parametrized_test")
    @Test
    void parametrizedPositiveTest() {
        String a = System.getProperty("ay");

        logger.info("\nay = " + a);

        assertEquals(a, "bi");
    }

    @Test
    void positiveTest() {
        int a = 2;
        int b = 3;

        assertEquals(a * b, 6);
    }
}
