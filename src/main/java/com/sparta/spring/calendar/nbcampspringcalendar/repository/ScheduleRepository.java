package com.sparta.spring.calendar.nbcampspringcalendar.repository;

import com.sparta.spring.calendar.nbcampspringcalendar.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

}
