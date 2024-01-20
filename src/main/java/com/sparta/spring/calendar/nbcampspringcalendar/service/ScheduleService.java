package com.sparta.spring.calendar.nbcampspringcalendar.service;

import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleRequestDto;
import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleResponseDto;
import com.sparta.spring.calendar.nbcampspringcalendar.entity.Schedule;
import com.sparta.spring.calendar.nbcampspringcalendar.repository.ScheduleRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

  private final ScheduleRepository scheduleRepository;

  public ScheduleService(ScheduleRepository scheduleRepository) {
    this.scheduleRepository = scheduleRepository;
  }

  public List<ScheduleResponseDto> getAllSchedules() {
    return scheduleRepository.findAll().stream().map(ScheduleResponseDto::new).toList();
  }

  public ScheduleResponseDto getSchedule(Long id) {
    return new ScheduleResponseDto(findSchedule(id));
  }

  public ScheduleResponseDto createSchedule(ScheduleRequestDto scheduleRequestDto) {
    Schedule schedule = new Schedule(scheduleRequestDto);

    Schedule savedSchedule = scheduleRepository.save(schedule);

    return new ScheduleResponseDto(savedSchedule);
  }

  public Long updateSchedule(Long id, ScheduleRequestDto scheduleRequestDto) {
    Schedule schedule = findSchedule(id);

    schedule.update(scheduleRequestDto);

    return id;
  }

  public Long deleteSchedule(Long id) {
    Schedule schedule = findSchedule(id);

    scheduleRepository.delete(schedule);

    return id;
  }


  private Schedule findSchedule(Long id) {
    return scheduleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Schedule id:" + id + " not found."));
  }

}
