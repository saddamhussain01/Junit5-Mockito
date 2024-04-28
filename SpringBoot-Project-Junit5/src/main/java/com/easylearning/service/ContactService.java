package com.easylearning.service;

import com.easylearning.entity.Contact;
import com.easylearning.exception.ContactNotFoundException;
import com.easylearning.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
	
    @Autowired
    ContactRepository contactRepository;

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
    public List<Contact> getContactList(){
        return contactRepository.findAll();
    }

    public Contact getContactById(Long id){
        return contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact Not Found"+id));

    }

    public void deleteContact(Long id){
        contactRepository.deleteById(id);
    }

}
