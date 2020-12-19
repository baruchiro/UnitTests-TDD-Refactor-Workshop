using System;
using Gildedrose;  
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace GildedRoseTest

{
    [TestClass]
    public class TestExample
    {
        [TestMethod]
        public void TestMethod1()
        {
           
        Gildedrose.Item myItem = new Item("foo", 0, 0);
        Assert.AreEqual("foo",myItem.Name,"simple test");
        }
    }
}
