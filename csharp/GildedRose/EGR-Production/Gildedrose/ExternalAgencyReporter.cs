using System;
using System.Diagnostics;

namespace Gildedrose
{
    public class ExternalAgencyReporter
    {
        public static void ReportItem(Item item)
        {
            ExternalCounter.AddItem();
        }
    }
}