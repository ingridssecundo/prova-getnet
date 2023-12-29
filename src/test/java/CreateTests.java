import com.github.javafaker.Faker;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class CreateTests {

    Faker faker = new Faker();
    String name = faker.name().firstName();
    String job = faker.job().title();

    protected Especificacoes response = new Especificacoes();

    @Test
    public void cadastrarFuncionarioTest(){
        ResponseSpecification rs = response.setResponseOkSpec();
        FuncionarioServices.cadastrarFuncionario(name, job)
                .spec(rs)
                .body(matchesJsonSchemaInClasspath("contrato.json"))
        ;
    }
}
