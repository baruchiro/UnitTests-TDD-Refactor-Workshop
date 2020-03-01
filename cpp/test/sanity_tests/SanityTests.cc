#include <gtest/gtest.h>
#include <gmock/gmock.h>
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

class Turtle {
    virtual int PenDown() = 0;
};

class MockTurtle : public Turtle {
public:
    MOCK_METHOD(int, PenDown, (), (override));
};

using testing::AtLeast;
using testing::Return;// #1

TEST(SanityTest, Mocking) {
    MockTurtle turtle;                             
    EXPECT_CALL(turtle, PenDown())                  
            .Times(AtLeast(1)).WillOnce(Return(100));
int yaki = turtle.PenDown();
    EXPECT_EQ(100,yaki);

}