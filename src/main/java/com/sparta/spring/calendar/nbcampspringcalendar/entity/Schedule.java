package com.sparta.spring.calendar.nbcampspringcalendar.entity;

import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;


@Entity
@Getter
@Setter
@Table(name = "nbcampspringcalendar") // 매핑할 테이블의 이름을 지정
@NoArgsConstructor
public class Schedule extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    }

    public boolean checkPassword(String password) {
        return Objects.equals(this.password, password);
    }

    public boolean checkPassword(ScheduleRequestDto scheduleRequestDto) {
        return checkPassword(scheduleRequestDto.getPassword());
    }

}
