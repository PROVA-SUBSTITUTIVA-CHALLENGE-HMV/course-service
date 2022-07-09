package com.vergara.henrique.courseservice.controller;

import com.vergara.henrique.courseservice.model.request.CreateCourseRequest;
import com.vergara.henrique.courseservice.model.response.CourseResponse;
import com.vergara.henrique.courseservice.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("courses")
@CrossOrigin
@RequiredArgsConstructor
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public ResponseEntity<CourseResponse> create(
            @RequestBody final CreateCourseRequest createCourseRequest
    ) {
        final var createdCourseResponse = courseService.create(createCourseRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCourseResponse);
    }

    @GetMapping
    public ResponseEntity<List<CourseResponse>> findAllByTerm(
            @RequestParam(name = "term", defaultValue = "", required = false) String term) {
        final var courseListResponse = courseService.allByTerm(term);
        return ResponseEntity.ok(courseListResponse);
    }

    @GetMapping("{id}")
    public ResponseEntity<CourseResponse> findById(@PathVariable Long id) {
        final var courseResponse = courseService.byId(id);
        return ResponseEntity.ok(courseResponse);
    }

    @PutMapping("{id}")
    public ResponseEntity<CourseResponse> update(
            @PathVariable Long id,
            @RequestBody CreateCourseRequest toUpdateCourseRequest) {
        final var courseResponse = updateCourse.processById(id, toUpdateCourseRequest);
        return ResponseEntity.ok(courseResponse);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CourseResponse> deleteById(
            @PathVariable(name = "id") Long id) {
        deleteCourse.processById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
