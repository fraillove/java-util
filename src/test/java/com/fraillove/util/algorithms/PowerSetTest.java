package com.fraillove.util.algorithms;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class PowerSetTest {

  @Test
  public void testPowerSet() {

    final List<String> list = new ArrayList<> ();
    final List<List<String>> powerSet = new ArrayList<>();
    powerSet.add(Collections.emptyList());
    assertThat(PowerSet.powerSet(list), is(powerSet));

    list.add("a");
    powerSet.add(Arrays.asList("a"));
    assertThat(PowerSet.powerSet(list), is(powerSet));

    list.add("b");
    list.add("c");
    final List<List<String>> result = PowerSet.powerSet(list);
    assertThat(result.size(), is(8));
    assertTrue(result.contains(Collections.emptyList()));
    assertTrue(result.contains(Arrays.asList("a")));
    assertTrue(result.contains(Arrays.asList("b")));
    assertTrue(result.contains(Arrays.asList("c")));
    assertTrue(result.contains(Arrays.asList("a", "b")));
    assertTrue(result.contains(Arrays.asList("b", "c")));
    assertTrue(result.contains(Arrays.asList("a", "c")));
    assertTrue(result.contains(Arrays.asList("a", "b", "c")));
  }
  @Test
  public void testIterativePowerSet() {

    final List<String> list = new ArrayList<> ();
    final List<List<String>> powerSet = new ArrayList<>();
    powerSet.add(Collections.emptyList());
    assertThat(PowerSet.iterativePowerSet(list), is(powerSet));

    list.add("a");
    powerSet.add(Arrays.asList("a"));
    assertThat(PowerSet.iterativePowerSet(list), is(powerSet));

    list.add("b");
    list.add("c");
    final List<List<String>> result = PowerSet.iterativePowerSet(list);
    assertThat(result.size(), is(8));
    assertTrue(result.contains(Collections.emptyList()));
    assertTrue(result.contains(Arrays.asList("a")));
    assertTrue(result.contains(Arrays.asList("b")));
    assertTrue(result.contains(Arrays.asList("c")));
    assertTrue(result.contains(Arrays.asList("a", "b")));
    assertTrue(result.contains(Arrays.asList("b", "c")));
    assertTrue(result.contains(Arrays.asList("a", "c")));
    assertTrue(result.contains(Arrays.asList("a", "b", "c")));
  }

  @Test
  public void testIterativePowerSet2() {

    final List<String> list = new ArrayList<> ();
    final List<List<String>> powerSet = new ArrayList<>();
    powerSet.add(Collections.emptyList());
    assertThat(PowerSet.iterativePowerSet2(list), is(powerSet));

    list.add("a");
    powerSet.add(Arrays.asList("a"));
    assertThat(PowerSet.iterativePowerSet2(list), is(powerSet));

    list.add("b");
    list.add("c");
    final List<List<String>> result = PowerSet.iterativePowerSet2(list);
    assertThat(result.size(), is(8));
    assertTrue(result.contains(Collections.emptyList()));
    assertTrue(result.contains(Arrays.asList("a")));
    assertTrue(result.contains(Arrays.asList("b")));
    assertTrue(result.contains(Arrays.asList("c")));
    assertTrue(result.contains(Arrays.asList("a", "b")));
    assertTrue(result.contains(Arrays.asList("b", "c")));
    assertTrue(result.contains(Arrays.asList("a", "c")));
    assertTrue(result.contains(Arrays.asList("a", "b", "c")));
  }
}
