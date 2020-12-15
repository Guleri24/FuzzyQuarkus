package com.guleri.superheroes.hero;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class HeroResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/api/heroes")
                .then()
                .statusCode(200)
                .body(is("Hello FuzzyQuarkus"));
    }
}
