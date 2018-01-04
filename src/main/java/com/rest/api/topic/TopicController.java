package com.rest.api.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/all")
	public List<Topic> getTopics(){
		return topicService.getTopics();
	}
	
	@GetMapping("/{topicId}")
	public Topic getTopic(@PathVariable int topicId){
		Topic rTopic = topicService.getTopic(topicId);
		return rTopic;
	}

}
