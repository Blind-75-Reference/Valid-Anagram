# [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/description/)

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
  
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

<details>
  <summary>Hint #1</summary>
  
  Brute Force Solution - Consider each character in one string, and search the other string for that character. You will also need to remove checked characters from the searched string.
  
</details>

<details>
  <summary>Hint #2</summary>
  
  Optimize - If the strings are of different length, you can return false without further work.
  
</details>

<details>
  <summary>Hint #3</summary>
  
  Optimize - Would sorting both strings make solving the problem quicker?
  
</details>

<details>
  <summary>Hint #4</summary>
  
  Optimize - All we really need to consider is if both strings have the exact same frequency for every letter in the alphabet.
  
</details>

