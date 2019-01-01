package com.fraillove.util.hamcrest;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IsEqualJSONTest {

  @Test
  public void test() {
    assertThat(new String[] { "foo", "bar" }, IsEqualJSON.equalToJSON("[\"foo\", \"bar\"]"));
  }

  @Test(expected = AssertionError.class)
  public void testFailure() {
    assertThat(new String[] { "foo", "bar" }, IsEqualJSON.equalToJSON("[\"foo2\", \"bar\"]"));
  }
}
