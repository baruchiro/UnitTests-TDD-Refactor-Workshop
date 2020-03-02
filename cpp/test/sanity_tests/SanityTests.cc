#include <gtest/gtest.h>
#include "UnInstantiableClass.h"
#include "InterestingClass.h"
#include "ExternalCalls.h"

TEST(SanityTest, UnInstantiableClass) {
    UnbelivableComplexClass *myUnbelivable = new UnbelivableComplexClass();
    UnInstantiableClass *myClass = new UnInstantiableClass(*myUnbelivable);
    myClass->methodA(30);
    myClass->methodB(50);
    EXPECT_EQ(28764,myClass->getAmount());
}

TEST(SanityTest, InterestingClass) {
    InterestingClass *myInteresting = new InterestingClass();
    myInteresting->longMethod(40);
   }

