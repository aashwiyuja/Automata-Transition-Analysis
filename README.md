# Automata Transition Analysis

## Overview

This project consists of three Java classes: `PowerSet`, `States`, and `Transitional`. These classes are designed to work together for analyzing transitions in an automata system. The `PowerSet` class generates the power set of a given array, the `States` class represents states with links to other states, and the `Transitional` class performs transitions analysis on a non-deterministic finite automaton (NFA).

## Classes

### 1. PowerSet

The `PowerSet` class provides a method to generate the power set of an array of integers.

```java
public class PowerSet {
  public List<List<Integer>> subsets(int[] nums) {
    // ... implementation details ...
  }
}
```

### 2. States

The `States` class represents states in an automata system with a name and links to other states.

```java
public class States {
  // ... implementation details ...
}
```

### 3. Transitional

The `Transitional` class, containing the main method, reads state information from a file (`Test_1.txt`), creates an NFA, generates the power set of the state set, and analyzes transitions.

```java
public class Transitional {
  public static void main(String args[]) {
    // ... implementation details ...
  }
}
```

## Usage

To use this project, follow these general steps:

1. **Instantiate States:**
   - Create instances of the `States` class representing individual states.
   - Establish links between states using the `setLinks` method.

2. **Generate Power Set:**
   - Use the `PowerSet` class to generate the power set of the state set.

3. **Analyze Transitions:**
   - The `Transitional` class reads state information from the provided file (`Test_1.txt`).
   - It creates an NFA, generates the power set, and analyzes transitions.

## Example

Given an input file (`Test_1.txt`), the program reads state information, creates an NFA, generates the power set, and outputs the equivalent DFA state set.

## Note

Ensure that the input file (`Test_1.txt`) follows the expected format for state and link information.
