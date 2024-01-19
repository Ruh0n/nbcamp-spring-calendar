package com.sparta.spring.calendar.nbcampspringcalendar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ScheduleEntity {

  @Id
  private long id;

}
