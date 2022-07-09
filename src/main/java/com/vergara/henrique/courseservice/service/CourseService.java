package com.vergara.henrique.courseservice.service;

import com.vergara.henrique.courseservice.model.request.CreateCourseRequest;
import com.vergara.henrique.courseservice.model.response.CourseResponse;
import org.springframework.stereotype.Service;

@Service
public interface CourseService {
    CourseResponse create(CreateCourseRequest request);
}
