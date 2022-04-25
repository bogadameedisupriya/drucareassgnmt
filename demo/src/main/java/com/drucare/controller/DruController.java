package com.drucare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.Service.DruTopicService;
import com.example.demo.DruTopic;
@RestController
public class DruController {
@Autowired
	DruTopicService druTopicService;
	
	@RequestMapping("/dru")
	public String sayHello() {
		return  "hello team " ;
	}
	@RequestMapping("/druTopics")
	public List<DruTopic> listOfData() {
		return druTopicService.getAllTopics();
	}
	@RequestMapping("/druTopics/{id}")
	public DruTopic getParticularTopic(@PathVariable String id ) {
	return 	druTopicService.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/druTopics")
	public void addTopic(@RequestBody DruTopic druTopic) {
		druTopicService.addTopic(druTopic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/druTopics/{id}")
	public void updateTopic(@RequestBody DruTopic druTopic, @PathVariable String id ) {
		druTopicService.updateTopic(druTopic, id );
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/druTopics/{id}")
	public void deleteTopic( @PathVariable String id ) {
		druTopicService.deleteTopic( id );
	}
	
}

