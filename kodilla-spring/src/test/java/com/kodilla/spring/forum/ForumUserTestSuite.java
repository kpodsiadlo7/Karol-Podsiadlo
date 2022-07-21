package com.kodilla.spring.forum;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;


@RunWith(SpringRunner.class)
public class ForumUserTestSuite {

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);
        //When
        String name = user.getName();
        //Then
        assertEquals("John Smith", name);
    }
}
