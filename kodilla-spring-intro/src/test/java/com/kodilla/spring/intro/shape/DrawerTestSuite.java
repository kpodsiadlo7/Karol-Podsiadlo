package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawerTestSuite {

    @Test
    void testDoDrawingWithCircle(){
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.toDrawing();
        //Then
        assertEquals("This is a circle", result);
    }

    @Test
    void testDoDrawingWithTrangle(){
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.toDrawing();
        //Then
        assertEquals("This is a tri angle", result);
    }
}
