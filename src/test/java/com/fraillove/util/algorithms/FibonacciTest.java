package com.fraillove.util.algorithms;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  @Test
  public void testRecursive() {
    assertThat(Fibonacci.fibonacci(0), is(0));
    assertThat(Fibonacci.fibonacci(1), is(1));
    assertThat(Fibonacci.fibonacci(6), is(8));
  }

  @Test
  public void testRecursiveMemoized() {
    assertThat(Fibonacci.fibonacciMemoized(0), is(0));
    assertThat(Fibonacci.fibonacciMemoized(1), is(1));
    assertThat(Fibonacci.fibonacciMemoized(6), is(8));
  }
  @Test
  public void testIterative() {
    assertThat(Fibonacci.iterativeFibonacci(0), is(0));
    assertThat(Fibonacci.iterativeFibonacci(1), is(1));
    assertThat(Fibonacci.iterativeFibonacci(6), is(8));
  }
}
