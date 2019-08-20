package com.rakuten.internship.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * このクラスは、データベースとのトランザクションをサポートするサービスクラスです。。
 */
@Service
@Transactional
public class TodoService {
@Autowired
    TodoRepository todoRepository;
    
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }
    
//    public Todo findById(Long id){
//        return  todoRepository.findById(id);
//    }

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }
    
}