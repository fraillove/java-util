package com.fraillove.util.algorithms;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
public class PermutationTest {

  @Test
  public void testStringPermutations() {
    assertThat(Permutation.permutations("a"), hasItems("a"));
    assertThat(Permutation.permutations("ab"), hasItems("ab", "ba"));
    assertThat(Permutation.permutations("abc"), hasItems("abc", "acb", "bac", "bca", "cab", "cba"));
  }

  @Test
  public void testListPermutations() {
    assertThat(Permutation.permutations(Arrays.asList("a")), hasItems(Arrays.asList("a")));
    assertThat(Permutation.permutations(Arrays.asList("a", "b", "c")), hasItems(
        Arrays.asList("a", "b", "c"),
        Arrays.asList("a", "c", "b"),
        Arrays.asList("b", "a", "c"),
        Arrays.asList("b", "c", "a"),
        Arrays.asList("c", "b", "a"),
        Arrays.asList("c", "a", "b")));
  }

}
