package com.example.its.web;

import com.example.its.domain.issue.TaskEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TaskController {
    // GET /tasks
    @GetMapping("/issues")
    public  String showList(Model model) {
        var taskList = List.of(
                new TaskEntity(1, "Task 1", "most important task"),
                new TaskEntity(2, "Task 2", "most important task"),
                new TaskEntity(3, "Task 3", "most important task")
        );
        model.addAttribute("taskList", taskList);
        return "tasks/list";
    }
}
