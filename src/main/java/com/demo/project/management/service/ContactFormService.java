package com.demo.project.management.service;

import com.demo.project.management.model.ContactForm;
import com.demo.project.management.repository.ContactFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactFormService {

    @Autowired
    private ContactFormRepository contactFormRepository;

    public List<ContactForm> findAll() {
        return contactFormRepository.findAll();
    }

    public Optional<ContactForm> findById(Long id) {
        return contactFormRepository.findById(id);
    }

    public ContactForm save(ContactForm contactForm) {
        return contactFormRepository.save(contactForm);
    }

    public void deleteById(Long id) {
        contactFormRepository.deleteById(id);
    }
}