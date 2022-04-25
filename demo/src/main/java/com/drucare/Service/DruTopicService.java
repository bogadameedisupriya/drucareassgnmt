package com.drucare.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.DruTopic;

@Service
public class DruTopicService {
	List<DruTopic>topicList = 	new ArrayList<DruTopic>(Arrays.asList(
			new DruTopic("1", "java", "beginner course"),
			new DruTopic("50", "japanese", "advancec course")
			));
	
	public List<DruTopic> getAllTopics() {
		return topicList;
	}

	public DruTopic getTopic(String id) {
	return	topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
	}

	public void addTopic(DruTopic druTopic) {
		topicList.add(druTopic);
	}

	public void updateTopic(DruTopic druTopic, String id) {
		for(int i = 0; i< topicList.size(); i++) {
			DruTopic t = topicList.get(i);
			if(t.getId().equals(id)){
				topicList.set(i, druTopic);
			}
		}
	}
	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
	}
}

