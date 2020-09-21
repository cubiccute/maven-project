package com.example;

/**
 * This is a class.
 */
public class Person {

  /**
   * This is a constructor.
   */
  public Person() {

  }

  //TODO: Add javadoc comment
  /**
	  * @param someone is a name
	  * @return string
  */
  public final String person(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
