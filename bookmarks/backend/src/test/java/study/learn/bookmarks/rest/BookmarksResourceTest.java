package study.learn.bookmarks.rest;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookmarksResourceTest {

    @Test
    @Disabled // TODO
    public void testHelloEndpoint() {
        given()
          .when().get("/bookmarks")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}