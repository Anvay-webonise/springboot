package org.springboot.controller;

import org.springboot.repository.MessagesRepository;
import org.springboot.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {

    @Autowired
    private MessagesRepository messagesRepository;

    @RequestMapping(value = "/createMessage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> createMessage(Message message) {
        messagesRepository.save(message);
        return new ResponseEntity<String>("Successfully added", HttpStatus.OK);
    }
}
