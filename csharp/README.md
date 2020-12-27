# LegacyCode - CSharp
First things first, the code here is based on the code created by Emily Bache (https://github.com/emilybache/GildedRose-Refactoring-Kata).

This code here can be served to practice legacy code in a safe environment.
The addition to the original code is that this code is persistent and so has some more challenges.

The goal, beside practicing, is to add another item type, "conjured" (see details here: https://github.com/NotMyself/GildedRose)

# How to practice?

As described here (https://www.agilesparks.com/blog/legacy-code-extract-firstut-cover-refactor-tdd/), the process of handling legacy code works something like this:
- Extract methods / rename to make the code clearer. These are considered safe refactorings and so you can/should do it without having tests in place.
- Cover the code with unit tests
- Refactor more aggressivley (now that unit tests are in place) where required
- TDD the new functionality

Good luck :-)
