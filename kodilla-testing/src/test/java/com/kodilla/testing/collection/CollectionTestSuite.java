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

    @DisplayName("when we pass a list of even and odd numbers, " +
            "then we should get a list containing only even numbers list"
    )
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(5);
        normalList.add(2);
        normalList.add(1);
        normalList.add(4);
        normalList.add(10);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(10);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list2");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}

