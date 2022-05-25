package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    private Statistics statisticsMock;
    private CalculateForumStatistics calculateForumStatistics;


    @BeforeEach
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User" +i);
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(2132);
        when(statisticsMock.commentsCount()).thenReturn(124451);
        calculateForumStatistics = new CalculateForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWith0Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateForumStatistics.getPostsQuantity());

    }

    @Test
    public void testCalculateAdvStatisticsWith1000Posts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, calculateForumStatistics.getPostsQuantity());
    }

    @Test
    public void testCalculateAdvStatisticsWith0Comments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateForumStatistics.getCommentsQuantity());
        assertEquals(0, calculateForumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0, calculateForumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2132);
        when(statisticsMock.postsCount()).thenReturn(124451);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(124451, calculateForumStatistics.getPostsQuantity());
        assertEquals(2132, calculateForumStatistics.getCommentsQuantity());
        assertEquals(12445.1, calculateForumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(213.2, calculateForumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.02, calculateForumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given

        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(2132, calculateForumStatistics.getPostsQuantity());
        assertEquals(124451, calculateForumStatistics.getCommentsQuantity());
        assertEquals(213.2, calculateForumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(12445.1, calculateForumStatistics.getAverageCommentsPerUser(), 0.01);
        assertEquals(58.37, calculateForumStatistics.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWith0Users(){
        //Given
        List<String>listMock = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, calculateForumStatistics.getNumbersOfUsers());
        assertEquals(0, calculateForumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(0, calculateForumStatistics.getAverageCommentsPerUser(), 0.01);

    }

    @Test
    public void testCalculateAdvStatisticsWith100Users(){
        //Given
        List<String> listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User" +i);
        }
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        calculateForumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, calculateForumStatistics.getNumbersOfUsers());
        assertEquals(21.32, calculateForumStatistics.getAveragePostsPerUser(), 0.01);
        assertEquals(1244.51, calculateForumStatistics.getAverageCommentsPerUser(), 0.01);
    }
}
