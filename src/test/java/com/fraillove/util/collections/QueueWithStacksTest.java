package com.fraillove.util.collections;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class QueueWithStacksTest {

  @Test
  public void testPeek() {
    final QueueWithStacks<String> q = new QueueWithStacks<>();
    assertThat(q.isEmpty(), is(true));
    q.add("foo");
    assertThat(q.peek(), is("foo"));
    q.add("bar");
    q.add("baz");
    assertThat(q.peek(), is("foo"));
  }

  @Test
  public void testRemove() {
    final QueueWithStacks<String> q = new QueueWithStacks<>();
    q.add("foo");
    q.add("bar");
    q.add("baz");
    assertThat(q.remove(), is("foo"));
    assertThat(q.remove(), is("bar"));
    assertThat(q.remove(), is("baz"));
    assertThat(q.isEmpty(), is(true));
  }
}
