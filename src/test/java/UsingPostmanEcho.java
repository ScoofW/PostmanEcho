import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UsingPostmanEcho {
    @Test
    void shouldReturnRequest() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .body("Once upon a long ago")// отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()// Выполняемые действия
                .post("/post")
                .then()// Проверки
                .statusCode(200)
                .body("data", equalTo("Once upon a long ago"))
        ;
    }
}