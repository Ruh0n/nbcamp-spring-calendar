package com.sparta.spring.calendar.nbcampspringcalendar.dto;

import com.sparta.spring.calendar.nbcampspringcalendar.entity.Schedule;
import com.sparta.spring.calendar.nbcampspringcalendar.entity.Timestamped;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
public class ScheduleResponseDto {

  private Long id;
  private String title;
  private String description;
  private String user;

  public ScheduleResponseDto(Schedule schedule) {
    this.id = schedule.getId();
    this.title = schedule.getTitle();
    this.description = schedule.getDescription();
    this.user = schedule.getUser();
  }

}
