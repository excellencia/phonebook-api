package com.example.phonebookapi.controller;

import com.example.phonebookapi.customException.ResourceNotFoundException;
import com.example.phonebookapi.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.phonebookapi.service.ContactService;
import javax.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable(value = "id") Long contactId) {
        return contactService.getContactById(contactId)
                .map(contact -> ResponseEntity.ok().body(contact))
                .orElseThrow(() -> new ResourceNotFoundException("Contact not found with id " + contactId));
    }

    @PostMapping
    public Contact createContact(@Valid @RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable(value = "id") Long contactId,
                                 @Valid @RequestBody Contact contactDetails) {
        return contactService.updateContact(contactId, contactDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteContact(@PathVariable(value = "id") Long contactId) {
        contactService.deleteContact(contactId);
        return ResponseEntity.ok().build();
    }
}

