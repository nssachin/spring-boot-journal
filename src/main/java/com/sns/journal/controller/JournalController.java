package com.sns.journal.controller;

import com.sns.journal.domain.Journal;
import com.sns.journal.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class JournalController {

    private JournalRepository repository;

    @Autowired
    public JournalController(JournalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("journal", repository.findAll());
        return "index";
    }

    @GetMapping("/journal")
    public @ResponseBody List<Journal> getJournal() {
        return repository.findAll();
    }

}
