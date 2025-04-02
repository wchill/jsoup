package org.wchill.jsoup.integration;

import org.wchill.jsoup.helper.HttpClientExecutorTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class HttpClientSessionIT extends SessionIT {
    @BeforeAll
    static void useHttpClient() {
        HttpClientExecutorTest.enableHttpClient();
    }

    @AfterAll
    static void resetClient() {
        HttpClientExecutorTest.disableHttpClient();
    }
}
