package com.rakuten.internship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.rakuten.internship.entity.Todo;
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
    // TODO 必要なメンバーを宣言してください。

    public List<Todo> findTodos(Integer id){
        Todo todo = todoRepository.findOne(id);
        return todo;
    }

    public Todo save(Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
}