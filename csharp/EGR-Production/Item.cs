
namespace GildedRose {
    public class Item {
        public Item(string Name, int Sellin, int Quality)
        {
            this.Name = Name;
            this.SellIn = Sellin;
            this.Quality = Quality;
        }

        public string Name { get; set; }
        public int SellIn { get; set; }
        public int Quality { get; set; }
    }
}
