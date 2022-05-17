package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;

import java.util.*;
public class CollectionTestSuite {
    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeAll
    public static void beforeAll(){
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @BeforeEach
    public void before(){
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test case: end\n");
    }

    @DisplayName("when we pass an empty list, " +
            "then we should have an empty list"
    )
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> expectedResultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(expectedResultList,emptyList);
    }

    @DisplayName("when we pass a list of all numbers, " +
            "then we should get a list containing only even numbers"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        Random random = new Random();
        int result;

        //Given
        List<Integer> normalList = new ArrayList<>();
        while(normalList.size() < 20){
            result = random.nextInt(100);
            normalList.add(result);
        }
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        List<Integer> expectedEvenNumbersList = new ArrayList<>();

        for(int evenNum: resultList){
            if(evenNum %2 == 0){
                expectedEvenNumbersList.add(evenNum);
            }
        }
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedEvenNumbersList, resultList);
    }
}
