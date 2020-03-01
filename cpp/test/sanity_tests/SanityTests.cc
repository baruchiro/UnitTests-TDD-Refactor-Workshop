#include <gtest/gtest.h>
#include <gmock/gmock.h>
#include "UnInstantiableClass.h"

TEST(SanityTest, UnIntantiableClass) {
    UnbelivableComplexClass *myUnbelivable = new UnbelivableComplexClass();
    UnInstantiableClass *myClass = new UnInstantiableClass(*myUnbelivable);
    myClass->methodA(30);
    myClass->methodB(50);
    EXPECT_EQ(28760,myClass->getAmount());
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