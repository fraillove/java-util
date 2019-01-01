package com.fraillove.util.algorithms;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class FactorialTest {

  @Test
  public void testRecursive() {
    assertThat(Factorial.factorial(5), is(120));
    assertThat(Factorial.factorial(0), is(1));
  }

  @Test
  public void testTailRecursive() {
    assertThat(Factorial.tailRecursiveFactorial(5), is(120));
    assertThat(Factorial.tailRecursiveFactorial(0), is(1));
  }

  @Test
  public void testIterative() {
    assertThat(Factorial.iterativeFactorial(5), is(120));
    assertThat(Factorial.iterativeFactorial(0), is(1));
  }

  @Test
  public void testBigInteger() {
    assertThat(Factorial.bigFactorial(5), is(BigInteger.valueOf(120)));
    assertThat(Factorial.bigFactorial(0), is(BigInteger.ONE));
  }

  @Test
  public void testStream() {
    assertThat(Factorial.streamFactorial(5), is(120));
    assertThat(Factorial.streamFactorial(0), is(1));
  }

}
