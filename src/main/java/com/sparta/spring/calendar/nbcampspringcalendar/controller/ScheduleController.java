package com.sparta.spring.calendar.nbcampspringcalendar.controller;

import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleRequestDto;
import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleResponseDto;
import com.sparta.spring.calendar.nbcampspringcalendar.service.ScheduleService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

  private final ScheduleService scheduleService;

  public ScheduleController(ScheduleService scheduleService) {
    this.scheduleService = scheduleService;
  }

  @GetMapping
  public List<ScheduleResponseDto> getAllSchedules() {
    return scheduleService.getAllSchedules();
  }

  @GetMapping("/{id}")
  public ScheduleResponseDto getSchedule(@PathVariable Long id) {
    return scheduleService.getSchedule(id);
  }

  @PostMapping()
  public ScheduleResponseDto createSchedule(@RequestBody ScheduleRequestDto scheduleRequestDto) {
    return scheduleService.createSchedule(scheduleRequestDto);
  }

  @PutMapping("/{id}")
  public Long updateSchedule(@PathVariable Long id, @RequestBody ScheduleRequestDto scheduleRequestDto) {
    return scheduleService.updateSchedule(id, scheduleRequestDto);
  }

  @DeleteMapping("/{id}")
  public Long deleteSchedule(@PathVariable Long id) {
    return scheduleService.deleteSchedule(id);
  }

}
