package com.rest.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic(1, "Java", "java Spring Boot"),
			new Topic(2, "Oracle", "Oracle geospatial"), new Topic(3, "SQL", "Data warehousing"));

	public List<Topic> getTopics() {
		return topics;
	}

	public Topic getTopic(int topicId) {
		Topic rTopic = topics.stream().filter(t -> t.getId() == topicId).findFirst().orElse(topics.get(0));
			return rTopic;
	}
}
