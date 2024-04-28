package com.easylearning.controller;

import com.easylearning.entity.Contact;
import com.easylearning.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact){
        return ResponseEntity.ok(contactService.saveContact(contact));
    }

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Long id){
        return ResponseEntity.ok(contactService.getContactById(id));
    }

    @GetMapping("/contacts")
    public ResponseEntity<List<Contact>> getContactList(){
        return ResponseEntity.ok(contactService.getContactList());
    }

    @DeleteMapping("/contact/{id}")
    public void deleteContact(@PathVariable Long id){
        contactService.deleteContact(id);
    }

}
