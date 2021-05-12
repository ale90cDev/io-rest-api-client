import it.restapiclient.RestClientApplication;
import org.junit.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertNotNull;

public class RestClientApplicationTest {

    @Test
    public void sendMessageToCfTestWinTest() {
        RestTemplate restTemplate = getRestTemplate();
        String cf = "AAAAAA00A00A000A";
        String subject = "Welcome new user !";
        String markdown =
                "# This is a markdown header\\n\\nto show how easily markdown can be converted to **HTML**\\n\\nRemember: this has to be a long text.";
        assertNotNull(RestClientApplication.sendMessageToCF(restTemplate, cf, subject, markdown).getId());
    }

    private RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Ocp-Apim-Subscription-Key", "1d36deca4a984067822118aeec8e2f23")
                .build();
        return restTemplate;
    }
}

