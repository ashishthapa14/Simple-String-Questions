# Java String Practice Questions

This project contains a collection of simple Java programs that solve common string manipulation problems. Each question is contained in its own file.

---

## Question 1: Reverse a String

**Problem:** Reverse a string provided by the user.

**Code:** The program reads a line of input from the user, then uses the `StringBuilder` class to reverse the string and print the result.

---

## Question 2: Palindrome Check

**Problem:** Check if a given string is a palindrome (reads the same forwards and backward).

**Code:** The program reads a line of input, cleans it by removing non-alphanumeric characters and converting it to lowercase. It then checks if the cleaned string is equal to its reverse.

---

## Question 3: Count Character Occurrences

**Problem:** Count the number of times a specific character appears in a string.

**Code:** The program reads a string and a character from the user. It then uses a stream to filter and count the occurrences of the specified character.

---

## Question 4: Find Duplicate Characters

**Problem:** Find and count duplicate characters in a string.

**Code:** The program reads a string and uses a `HashMap` to store the counts of each character. It then iterates through the map to find and print the characters that appear more than once.

---

## Question 5: Remove Duplicate Characters

**Problem:** Remove duplicate characters from a string, preserving the original order.

**Code:** The program reads a string and uses a stream with the `distinct()` method to remove duplicate characters before collecting the result into a new string.

---

## Question 6: Anagram Check

**Problem:** Check if two strings are anagrams of each other.

**Code:** The program reads two strings, cleans them by removing whitespace and converting them to lowercase. It then converts both strings to character arrays, sorts them, and checks if the sorted arrays are equal.

---

## Question 7: Find the First Non-Repeated Character

**Problem:** Find the first character in a string that does not repeat.

**Code:** The program uses a `LinkedHashMap` to maintain the insertion order of characters while counting their occurrences. It then iterates through the map to find and print the first character with a count of one.

---

## Question 8: Check if a String Contains Only Digits

**Problem:** Verify that a string consists exclusively of digits.

**Code:** The program reads a string and uses the `matches("\\d+")` method with a regular expression to determine if the string contains only digits.

---
