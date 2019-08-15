package com.rakuten.internship;

import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
public class TodoController {
    
    @Autowired

    TodoRepository todoRepository;

    
    // TODO 必要なメンバーを宣言してください。

    @GetMapping("/home")
    public String home(Model model) {
        List todos = (List) userRepository.findAll();
		model.addAttribute("todos", todos);
        return "home";
    }

    @GetMapping("/create")
    public String create(@RequestParam String title, @RequestParam String description) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setDescription(description);
        todoRepository.save(todo);
        return "complete";
    }

    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
        // TODO 必要なコードを作成してください。
        return null;
    }
}
