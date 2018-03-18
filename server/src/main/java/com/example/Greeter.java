package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param someone es el nombre de una persona 
  * @return greet es el saludo
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
