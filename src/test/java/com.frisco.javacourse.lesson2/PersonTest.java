package com.frisco.javacourse.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

  @Test
  public void shouldReturnHelloWorld(){
    Person frisco = new Person();
    assertEquals("Hello World", frisco.helloWorld() );
  }

}
