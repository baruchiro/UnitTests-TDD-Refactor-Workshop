using Microsoft.VisualStudio.TestTools.UnitTesting;
using ApprovalTests;
using System;

namespace EGR_Tests.legacycodeplaygroundtests
{
    //[UseReporter(typeof(VisualStudioReporter))]
    //[TestFixture]
    [TestClass]
    public class ApprovalTestsExample
    {
        [TestMethod]
        public void TestMethod1()
        {
            Approvals.VerifyAll();
        }
    }
}
