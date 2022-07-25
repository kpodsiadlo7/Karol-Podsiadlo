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
        String task1 = "toDoList task";
        String task2 = "inProgressList task";
        String task3 = "doneList task";
        //When
        board.getToDoList().getTasks().add("toDoList task");
        board.getInProgressList().getTasks().add("inProgressList task");
        board.getDoneList().getTasks().add("doneList task");
        //Then
        assertEquals(task1, board.getToDoList().getTasks().get(0));
        assertEquals(task2, board.getInProgressList().getTasks().get(0));
        assertEquals(task3, board.getDoneList().getTasks().get(0));
    }
}
