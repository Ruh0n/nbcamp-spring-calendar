package com.sparta.spring.calendar.nbcampspringcalendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class NbcampSpringCalendarApplication {

  public static void main(String[] args) {
    SpringApplication.run(NbcampSpringCalendarApplication.class, args);
  }

}
