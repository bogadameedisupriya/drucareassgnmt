package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.drucare.Entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

//	findByName;
}

