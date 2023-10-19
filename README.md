[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/GtheF9x8)
# Programming Patterns - Lab 13

This template repository is the starter project for Programming Patterns Lab 13. Written in Java, and tested with Gradle/JUnit.

### Question(s)

1. **Factory Coding Exercise**

You are given a class called `Person`. The person has two fields: `id`, and `name`.

Please implement a non-static `PersonFactory` that has a `createPerson()` method that takes a person's name and returns a new instance of `Person`.

The `id` of the person returned should be set as a 0-based index of the object created by that factory. So, the first person the factory makes should have id=0, second id=1 and so on.

2. **Adapter Coding Exercise**

Here's a very synthetic example for you to try.

You are given a `Rectangle` interface and an extension method on it. Try to define a `SquareToRectangleAdapter` that adapts the `Square` to the `IRectangle` interface.

### Setup Command

`gradle clean`

### Run Command

`gradle test`
