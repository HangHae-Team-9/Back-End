package com.asdf.ho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableJpaAuditing
@SpringBootApplication
public class HoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoApplication.class, args);
    }
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }

}
