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
  * @param someone es el nombre en string 
  * @return saludo
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
