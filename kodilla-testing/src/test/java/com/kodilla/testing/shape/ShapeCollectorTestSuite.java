package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("\nPreparing to execute test #" +testCounter);
    }

    @Nested
    @DisplayName("Tests for add every shape")
    class AddShapeTest{
        @Test
        void testAddFigureSquare() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(7);
            //When
            shapeCollector.addFigure(shape);
            //Then
            assertEquals(1,shapeCollector.getShapeList().size());
        }
        @Test
        void testAddFigureTriangle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(7,4);
            //When
            shapeCollector.addFigure(shape);
            //Then
            assertEquals(1,shapeCollector.getShapeList().size());
        }
        @Test
        void testAddFigureCircle() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(7);
            //When
            shapeCollector.addFigure(shape);
            //Then
            assertEquals(1,shapeCollector.getShapeList().size());
        }
    }

    @Nested
    @DisplayName("Tests for remove every figure")
    class TestRemoveFigures{
        @Test
        void testRemovingFigureSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            assertEquals(0,shapeCollector.getShapeList().size());
        }
        @Test
        void testRemovingFigureTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(4,2);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            assertEquals(0,shapeCollector.getShapeList().size());
        }
        @Test
        void testRemovingFigureCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(4);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            assertTrue(result);
            assertEquals(0,shapeCollector.getShapeList().size());
        }
    }

    @Nested
    @DisplayName("Tests for get every figure")
    class GetFigures{
        @Test
        void testGetFigureSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(shape,retrievedShape);
        }
        @Test
        void testGetFigureTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3,8);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(shape,retrievedShape);
        }
        @Test
        void testGetFigureCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape = shapeCollector.getFigure(0);
            //Then
            assertEquals(shape,retrievedShape);
        }
    }

    @Nested
    @DisplayName("Tests for show every figures")
    class TestShowFigures{
        @Test
        void testShowFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(77);
            Shape triangle = new Triangle(77,33);
            Shape circle = new Circle(77);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);

            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(square);
            shapeList.add(triangle);
            shapeList.add(circle);
            //When
            List<Shape> shapeResultList = shapeCollector.showFigures();
            //Then
            assertEquals(shapeList.toString(),shapeResultList.toString());
        }
    }
}