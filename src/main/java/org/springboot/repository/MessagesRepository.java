package org.springboot.repository;

import javax.transaction.Transactional;

import org.springboot.domain.Message;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface MessagesRepository extends  CrudRepository<Message, Long> {

}
