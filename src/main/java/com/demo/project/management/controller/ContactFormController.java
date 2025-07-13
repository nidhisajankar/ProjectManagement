package com.demo.project.management.controller;

import com.demo.project.management.model.ContactForm;
import com.demo.project.management.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contactform")
public class ContactFormController {

    @Autowired
    private ContactFormService contactFormService;

    @GetMapping
    public List<ContactForm> findAll() {
        return contactFormService.findAll();
    }

}
