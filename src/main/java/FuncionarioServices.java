import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;

public class FuncionarioServices {

    private static Especificacoes request = new Especificacoes();

    public static ValidatableResponse cadastrarFuncionario(String name, String job) {
        return given()
                .body("{ \"name\": \"" + name + "\",\n" +
                        "  \"job\": \"" + job + "\"\n" +
                        "}")
                .when()
                .log().all()
                .post("https://reqres.in/api/users")
                .then()
                .body(name, Matchers.notNullValue())
                .body(job,Matchers.notNullValue())
                ;
    }
}
