package com.sparta.spring.calendar.nbcampspringcalendar.entity;

import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleRequestDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "nbcampspringcalendar") // 매핑할 테이블의 이름을 지정
@NoArgsConstructor
public class Schedule extends Timestamped {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String title;
  private String description;
  private String user;
  private String password;

  public Schedule(ScheduleRequestDto scheduleRequestDto) {
    this.title = scheduleRequestDto.getTitle();
    this.description = scheduleRequestDto.getDescription();
    this.user = scheduleRequestDto.getUser();
    this.password = scheduleRequestDto.getPassword();
  }

  public void update(ScheduleRequestDto scheduleRequestDto) {
    this.title = scheduleRequestDto.getTitle();
    this.description = scheduleRequestDto.getDescription();
    this.user = scheduleRequestDto.getUser();
    this.password = scheduleRequestDto.getPassword();
  }
}
