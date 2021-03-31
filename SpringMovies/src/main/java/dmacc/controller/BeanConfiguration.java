package dmacc.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Contact;

@Configuration
public class BeanConfiguration {
	@Bean
	public Contact contact() {
		Contact bean = new Contact();
		bean.setName("Birdbox");
		bean.setRating(5);
		bean.setReview("Its pretty good!");
		return bean;
	}
}