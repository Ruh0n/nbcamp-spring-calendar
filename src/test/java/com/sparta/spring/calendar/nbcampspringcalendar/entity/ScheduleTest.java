package com.sparta.spring.calendar.nbcampspringcalendar.entity;

import com.sparta.spring.calendar.nbcampspringcalendar.repository.ScheduleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class ScheduleTest {

  @PersistenceContext
  EntityManager em;

  @Autowired
  ScheduleRepository scheduleRepository;

  @Test
  @DisplayName("Schedule 추가 테스트")
  @Transactional
  void test1() {
    Schedule schedule = new Schedule();

    em.persist(schedule);
  }

}


