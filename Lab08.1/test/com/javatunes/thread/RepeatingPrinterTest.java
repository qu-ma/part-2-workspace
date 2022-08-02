/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class RepeatingPrinterTest {

  public static void main(String[] args) {
    String printerName = "block-lambda";

    Thread thd1 = new Thread(new RepeatingPrinter());
    thd1.start();
    
    // DONE: initialize the 'printer' reference variable with a block lambda
    //  hint: you can copy / paste the *contents* of RepeatingPrinter's run() method
    //  note: change the sysout to show "block-lambda"
    Runnable printer = () -> {
      while (true) {
        System.out.println(printerName);
        try {
          Thread.sleep(750);
        } catch (InterruptedException e) {
        }
      }
    };
    
    // DONE: create another Thread, passing in the 'printer' reference as its Runnable - then start it
    Thread thd2 = new Thread(printer);
    thd2.start();

    System.out.println("MAIN METHOD Complete");
  }
}