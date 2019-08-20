package com.rakuten.internship;

import java.util.List;
import com.rakuten.internship.entity.Todo;
import com.rakuten.internship.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
/**
 * このクラスは、ウェブアプリケーションの挙動を制御するためのコントローラークラスです。。
 * コントローラーとして使えるように、コードを記入してください。
 */
@Controller
@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
public class TodoController {
    @Autowired

    private TodoService todoservice;
    

    @GetMapping("/")
    public String home(Model model) {
        List<Todo> todos = todoservice.findAll();
		model.addAttribute("todos", todos);
        return "home";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/create")
    public String createTodo(@Valid @ModelAttribute Todo todo, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "error";
        }
        else{
            todoservice.save(todo);
            return "redirect:home";
        }
    }
}
