package it.restapiclient;

import it.restapiclient.model.Body;
import it.restapiclient.model.Content;
import it.restapiclient.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

/**
 * Rest Api Client of the io service
 */
@SpringBootApplication
public class RestClientApplication {

    private static final Logger log = LoggerFactory.getLogger(RestClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RestClientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Ocp-Apim-Subscription-Key", "1d36deca4a984067822118aeec8e2f23")
                .build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        System.out.println("Write cf:");
        Scanner scanner = new Scanner(System.in);
        String cf = scanner.nextLine();
        log.info("cf: " + cf);
        System.out.println("Write subject (it must be a string of length >= 10 and < 121):");
        String subject = scanner.nextLine();
        log.info("subject: " + subject);
        System.out.println("Write markdown body (it must be a string of length >= 80 and < 10001):");
        String markdown = scanner.nextLine();
        log.info("markdown body: " + markdown);
        scanner.close();

        return args -> {
            Response response = sendMessageToCF(restTemplate, cf, subject, markdown);
            log.info(response.toString());
        };
    }

    /**
     * This method sends to the user with the specified cf, a message via the IO application.
     * @param restTemplate rest template required to communicate with the api io
     * @param cf cf of the user you want to send the message to
     * @param subject message subject
     * @param markdown message written in markdown
     * @return the response from the io application which contains the identifier of the created message
     */
    public static Response sendMessageToCF(RestTemplate restTemplate,
                                           String cf, String subject, String markdown) {
        Content content = new Content();
        content.setSubject(subject);
        content.setMarkdown(markdown);

        Body body = new Body();
        body.setContent(content);
        return restTemplate.postForObject(
                "https://api.io.italia.it/api/v1/messages/" + cf, body, Response.class);
    }

}
