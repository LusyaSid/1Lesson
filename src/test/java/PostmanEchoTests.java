import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class  PostmanEchoTests {
    String UrlTest="https://postman-echo.com";
    @Test
    public void GetRequestWoopsTest() {

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .when()
                .log().all()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .log().all()
                .statusCode(200)
                .body("args.foo1",equalTo("bar1"))
                .body("args.foo2",equalTo("bar2"));
    }

    @Test
    public void PostRawTextTest() {
        String rawText="This is expected to be sent back as part of response body.";

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .body(rawText)
                .when()
                .log().all()
                .post("/post  ")
                .then()
                .log().all()
                .statusCode(200)
                .body("data",equalTo(rawText));
    }

    @Test
    public void PostFormDataTest() {
        String formText ="{\"foo1\": \"bar1\", \"foo2\": \"bar2\"}";

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .body(formText)
                .when()
                .log().all()
                .post("/post")
                .then()
                .log().all()
                .statusCode(200)
                .body("json.foo1",equalTo("bar1"))
                .body("json.foo2",equalTo("bar2"));
    }

    @Test
    public void PutRequestTest() {
        String rawText="This is expected to be sent back as part of response body.";

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .body(rawText)
                .when()
                .log().all()
                .put("/put")
                .then()
                .log().all()
                .statusCode(200)
                .body("data",equalTo(rawText));
    }

    @Test
    public void PatchRequestTest() {
        String rawText="This is expected to be sent back as part of response body.";

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .body(rawText)
                .when()
                .log().all()
                .patch("/patch")
                .then()
                .log().all()
                .statusCode(200)
                .body("data",equalTo(rawText));
    }

    @Test
    public void DeleteRequestTest() {
        String rawText="This is expected to be sent back as part of response body.";

        given()
                .baseUri(UrlTest)
                .contentType(ContentType.JSON)
                .body(rawText)
                .when()
                .log().all()
                .delete("/delete")
                .then()
                .log().all()
                .statusCode(200)
                .body("data",equalTo(rawText));
    }
}

