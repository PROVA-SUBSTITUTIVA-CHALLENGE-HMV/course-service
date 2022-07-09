package com.vergara.henrique.courseservice.util;

import com.vergara.henrique.courseservice.model.entity.Content;
import com.vergara.henrique.courseservice.model.request.CreateContentRequest;
import com.vergara.henrique.courseservice.model.response.ContentResponse;
import org.springframework.stereotype.Service;

@Service
public class ContentMapper {

    public Content toContent(final CreateContentRequest createContentRequest) {
        return Content.builder()
                .description(createContentRequest.getDescription())
                .build();
    }

    public ContentResponse toResponse(final Content content) {
        return ContentResponse.builder()
                .description(content.getDescription())
                .build();
    }
}