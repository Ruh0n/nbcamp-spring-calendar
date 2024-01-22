package com.sparta.spring.calendar.nbcampspringcalendar.service;

import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleRequestDto;
import com.sparta.spring.calendar.nbcampspringcalendar.dto.ScheduleResponseDto;
import com.sparta.spring.calendar.nbcampspringcalendar.entity.Schedule;
import com.sparta.spring.calendar.nbcampspringcalendar.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public List<ScheduleResponseDto> getAllSchedules() {
        return scheduleRepository.findAllByOrderByCreatedAtDesc().stream().map(ScheduleResponseDto::new).toList();
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

        if (schedule.checkPassword(scheduleRequestDto)) {
            schedule.update(scheduleRequestDto);
        } else {
            throw new IllegalArgumentException("Wrong password");
        }

        return id;
    }

    public Long deleteSchedule(Long id, String password) {
        Schedule schedule = findSchedule(id);

        if (schedule.checkPassword(password)) {
            scheduleRepository.delete(schedule);
        } else {
            throw new IllegalArgumentException("Wrong password");
        }

        return id;
    }


    private Schedule findSchedule(Long id) {
        return scheduleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Schedule id:" + id + " not found."));
    }

}
