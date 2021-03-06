package io.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    @RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("spring","spring framework","spring description"),
				new Topic("spr","spring framew","spring desion"),
				new Topic("spring","spring work","spring descion"),
				new Topic("spng"," framework","spring "),
				new Topic("pring","spring frame","spring ption")
				);
	}
}
