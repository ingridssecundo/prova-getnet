import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.apache.http.HttpStatus.SC_CREATED;

public class Especificacoes {

    ResponseSpecification responseSpec;

    public ResponseSpecification setResponseOkSpec() {
        return responseSpec = new ResponseSpecBuilder().expectStatusCode(SC_CREATED).expectContentType("application/Json").build();
    }
}
