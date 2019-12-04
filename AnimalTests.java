package com.animaloop.java;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTests {

    @Test
    void TestDogSound() {
        Dog sounds = new Dog();
        assertEquals("Bark", Dog.sounds());
    }

    @Test
    void TestDogEats() {
        Dog eating = new Dog();
        assertEquals("Food", Dog.eat());
    }

    @Test
    void TestCatSound(){
        Cat sounding = new Cat();
        assertEquals("Meow", Cat.sounds());
    }

    @Test
    void TestCatEats(){
        Cat eater = new Cat();
        assertEquals("Food", Cat.eat());
    }



}