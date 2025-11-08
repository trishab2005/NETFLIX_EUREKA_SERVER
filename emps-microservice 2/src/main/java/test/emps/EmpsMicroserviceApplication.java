package test.emps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class EmpsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpsMicroserviceApplication.class, args);
	}

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }

}
