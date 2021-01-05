namespace Gildedrose
{
    public class ExternalCounter
    {
        static ExternalCounter externalCounter = new ExternalCounter();

        private int counter = 0;
        
        private ExternalCounter() { }
       
        public static void AddItem()
        {
            ExternalCounter.externalCounter.AddOne();
        }

        public void AddOne()
        {
            counter++;
        }

        public static int GetNumberOfItems()
        {
            return ExternalCounter.externalCounter.GetCounter();
        }

        private int GetCounter()
        {
            return counter;
        }
    }
}