package org.springboot.controller;

import org.springboot.domain.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public ResponseEntity<Message> getMessage() {
        Message message = new Message();
        message.setMessageId(10);
        message.setMessage("Hello");
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResponseEntity<Message> helloMapping(@RequestBody Message message) {
        String messageString = message.getMessage();
        message.setMessage(messageString + " Message is appended with 123");
        return new ResponseEntity<Message>(message, HttpStatus.OK);
    }
}
