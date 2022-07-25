package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAddTask(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        boolean canReadToDoList = context.containsBean("toDoList");
        boolean canReadInProgressList = context.containsBean("inProgressList");
        boolean canReadDoneList = context.containsBean("doneList");
        //Then
        assertTrue(canReadToDoList);
        assertTrue(canReadInProgressList);
        assertTrue(canReadDoneList);
    }
}
