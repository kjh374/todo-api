package com.example.todo.todoapi.service;

import com.example.todo.todoapi.repository.TodoRepository;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Getter @Setter
@ToString @EqualsAndHashCode
@AllArgsConstructor
@Builder
@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class TodoService {

    private final TodoRepository todoRepository;
}
