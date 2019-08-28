package com.rakuten.internship;

import java.util.List;
import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
@RequestMapping("/")
public class TodoController {
    @Autowired

    private TodoService todoservice;
    

    @GetMapping("/")
    public String home(Model model) {
        List<Todo> todos = todoservice.findTodos();
		model.addAttribute("todos", todos);
        return "home";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/create")
    public String createTodo(@ModelAttribute Todo todo) {
            todoservice.save(todo);
            return "complete";
    }
    @GetMapping({"home/{delete}"})
    public String delete(@RequestParam(name = "delete") Long id) {
            if(id >= 1){
            todoservice.delete(id);
        }

            return "redirect:/home";
    }
}
