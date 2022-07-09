package com.vergara.henrique.courseservice.util;

import com.vergara.henrique.courseservice.model.entity.Module;
import com.vergara.henrique.courseservice.model.request.CreateModuleRequest;
import com.vergara.henrique.courseservice.model.response.ModuleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ModuleMapper {

    private final ContentMapper contentMapper;

    public Module toModule(final CreateModuleRequest createModuleRequest) {
        final var contentList = createModuleRequest.getContents().stream()
                .map(contentMapper::toContent)
                .collect(Collectors.toList());

        return Module.builder()
                .name(createModuleRequest.getName())
                .workload(createModuleRequest.getWorkload())
                .contents(contentList)
                .build();
    }

    public ModuleResponse toResponse(final Module module) {
        final var contentResponseList = module.getContents().stream()
                .map(contentMapper::toResponse)
                .collect(Collectors.toList());

        return ModuleResponse.builder()
                .name(module.getName())
                .contents(contentResponseList)
                .workload(module.getWorkload())
                .build();
    }
}

