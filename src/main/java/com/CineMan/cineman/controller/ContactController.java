package com.CineMan.cineman.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.CineMan.cineman.model.Contact;


@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private com.CineMan.cineman.repository.ContactRepository contactRepository;

     @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
    
}
