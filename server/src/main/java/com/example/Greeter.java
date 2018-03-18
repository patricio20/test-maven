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
  * Función que permite saludar
  * @param someone el nombre de la persona
  * @return saludo
  */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
