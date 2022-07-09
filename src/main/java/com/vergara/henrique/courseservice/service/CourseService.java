package com.vergara.henrique.courseservice.service;

import com.vergara.henrique.courseservice.model.request.CreateCourseRequest;
import com.vergara.henrique.courseservice.model.response.CourseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    CourseResponse create(CreateCourseRequest request);
    List<CourseResponse> allByTerm(String request);
    CourseResponse findById(Long id);
}
