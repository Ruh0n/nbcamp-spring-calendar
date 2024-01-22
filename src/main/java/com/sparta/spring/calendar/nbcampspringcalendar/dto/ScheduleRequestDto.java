package com.sparta.spring.calendar.nbcampspringcalendar.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ScheduleRequestDto {

    private String title;
    private String description;
    private String user;
    private String password;

}
