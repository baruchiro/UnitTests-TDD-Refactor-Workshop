using System;
using Gildedrose;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace GildedRoseTest

{
    [TestClass]
    public class Sanity
    {
        [TestMethod]
        public void TestMethod1()
        {

            Item myItem = new Item("foo", 0, 0);
            Assert.AreEqual("foo", myItem.Name, "simple test");
        }


        /*[TestMethod]
        public void sanity()
        {
            GildedRoseManager myGR = new GildedRoseManager();
            myGR.ProcessOption('1');    
            myGR.ProcessOption('2');
            myGR.ProcessOption('3');
            myGR.ProcessOption('4');
            Assert.AreEqual(4,ExternalCounter.externalCounter.GetCounter());
            for (int i = 0; i < 10; i++)
                myGR.ProcessOption('0');
            Assert.AreEqual(30, myGR.Items[0].Quality, "Brie quality");
            Assert.AreEqual(35, myGR.Items[1].Quality, "Backstage pass quality");
            Assert.AreEqual(20, myGR.Items[2].Quality, "Sulfuras quality");
            Assert.AreEqual(10, myGR.Items[3].Quality, "Beer quality");
            Assert.AreEqual(5, myGR.Items[0].SellIn, "Brie SellIn");
            Assert.AreEqual(5, myGR.Items[1].SellIn, "Backstage pass SellIn");
            Assert.AreEqual(15, myGR.Items[2].SellIn, "Sulfuras SellIn");
            Assert.AreEqual(5, myGR.Items[3].SellIn, "Beer SellIn");
        }*/
    }
}
