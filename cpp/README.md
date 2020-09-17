# C++ version of Gilded Rose refactoring kata and some other stuff
# Gilded Rose is based on material found here: https://github.com/emilybache/GildedRose-Refactoring-Kata

## Prerequisites
* CMake version >= 3.13
* C++ compiler that supports C++11

## How to build and run tests in a terminal

### Build tests

    $ cd ${GIT_FOLDER}/GildedRose-Refactoring-Kata/cpp
    $ mkdir build
    $ cd build
    $ cmake ..
    $ cmake --build .

### Show available tests

    $ cd ${GIT_FOLDER}/GildedRose-Refactoring-Kata/cpp/build
    $ ctest -N
   
### Run all tests

    $ ctest

### Run all tests with verbose output

    $ ctest -VV


## How to build and run tests using the [CLion IDE](https://www.jetbrains.com/clion/)

1. Start CLion
2. Select menu `File - Open...`
3. Select folder `${GIT_FOLDER}/GildedRose-Refactoring-Kata/cpp`
4. Select menu `Build - Build Project`
4. Select menu `Run - Run...`
4. Select what test variant to run, e.g. `GildedRoseCatch2ApprovalTests`.

## How to build and run tests using Visual Studio 2019 

1. Start Visual Studio 2019
2. Select `Open a local folder`
3. Select folder `${GIT_FOLDER}/GildedRose-Refactoring-Kata/cpp`
4. Wait for message `CMake generation finished.` in the CMake output window at the bottom
5. Select what test variant to run in the drop down menu for Startup Items, e.g. `GildedRoseCatch2ApprovalTests.exe`.
6. Select menu `Debug - Start`

## How to run coverage
First, make sure you have gcov and gcovr installed
from build directory run: 
gcovr -r ../src --object-directory src/CMakeFiles/src.dir --html-details --output coverage.html

Then open coverage.html in a browser

