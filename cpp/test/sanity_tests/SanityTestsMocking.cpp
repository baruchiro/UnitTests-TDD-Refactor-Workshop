#include <gtest/gtest.h>
#include <gmock/gmock.h>

/*class Turtle {
    virtual int PenDown() = 0;
};

class MockTurtle : public Turtle {
public:
    MOCK_METHOD(int, PenDown, (), (override));
};*/

class Turtle {
  public:;  
  virtual ~Turtle() {};
  virtual void PenUp() = 0;
  virtual void PenDown() = 0;
  virtual void Forward(int distance) = 0;
  virtual void Turn(int degrees) = 0;
  virtual void GoTo(int x, int y) = 0;
  virtual int GetX() const = 0;
  virtual int GetY() const = 0;
};

class MockTurtle : public Turtle {
 public:
  MOCK_METHOD(void, PenUp, (), (override));
  MOCK_METHOD(void, PenDown, (), (override));
  MOCK_METHOD(void, Forward, (int distance), (override));
  MOCK_METHOD(void, Turn, (int degrees), (override));
  MOCK_METHOD(void, GoTo, (int x, int y), (override));
  MOCK_METHOD(int, GetX, (), (const, override));
  MOCK_METHOD(int, GetY, (), (const, override));
};

using testing::AtLeast;
using testing::Return;// #1

TEST(SanityTest, Mocking) {
    MockTurtle turtle;                             
    EXPECT_CALL(turtle, GetX())                  
            .Times(AtLeast(1)).WillOnce(Return(100)).WillOnce(Return(200));
 int yaki = turtle.GetX();
  EXPECT_EQ(100,yaki);
  yaki = turtle.GetX();
    EXPECT_EQ(200,yaki);

}