#include <gtest/gtest.h>
#include <gmock/gmock.h>
/*#include "GildedRose.h"

TEST(GildedRoseTest, Foo) {
    vector<Item> items;
    items.push_back(Item("Foo", 0, 0));
    GildedRose app(items);
    app.updateQuality();
    EXPECT_EQ("Foo", app.items[0].name);
}*/

class Turtle {
    virtual int PenDown() = 0;
};

class MockTurtle : public Turtle {
public:
    MOCK_METHOD(int, PenDown, (), (override));
};
using testing::AtLeast;
using testing::Return;// #1

TEST(PainterTest, CanDrawSomething) {
    MockTurtle turtle;                              // #2
    EXPECT_CALL(turtle, PenDown())                  // #3
            .Times(AtLeast(1)).WillOnce(Return(100));
int yaki = turtle.PenDown();
    EXPECT_EQ(100,yaki);

}