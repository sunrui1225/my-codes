package cn.rainshell.mycodes.completablefuture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompletableFutureExampleTest {

    @Autowired
    private CompletableFutureExample example;

    @Test
    void buildParamsWithFuture() {
        Exception exception = assertThrows(Exception.class, () -> example.buildParamsWithFuture(10L));

        String expectedMessage = "线程池获取数据异";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}