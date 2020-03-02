#include <gtest/gtest.h>
#include <gmock/gmock.h>

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