package com.vergara.henrique.courseservice.service.impl;

import com.vergara.henrique.courseservice.exceptions.NotFoundException;
import com.vergara.henrique.courseservice.model.request.CreateCourseRequest;
import com.vergara.henrique.courseservice.model.response.CourseResponse;
import com.vergara.henrique.courseservice.repository.CourseRepository;
import com.vergara.henrique.courseservice.service.CourseService;
import com.vergara.henrique.courseservice.util.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public CourseResponse create(CreateCourseRequest request) {
        final var courseEntity = courseMapper.toCourse(request);
        final var createdCourse = courseRepository.save(courseEntity);
        return courseMapper.toResponse(createdCourse);    }

    @Override
    public List<CourseResponse> allByTerm(String request) {
        final var courseList = courseRepository.findAllByNameContainingOrDescriptionContaining(request, request);
        return courseMapper.toResponse(courseList);
    }

    @Override
    public CourseResponse findById(Long id) {
        final var course = courseRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Course [%s] not found", id)));

        return courseMapper.toResponse(course);
    }
}
