using System;


namespace Gildedrose
{
    class BigBrother
    {
        public static void Report(NewItem item)
        {
            ExternalCounter.AddItem();
        }
    }
}
