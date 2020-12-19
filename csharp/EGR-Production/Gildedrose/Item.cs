
namespace Gildedrose {
    public class Item {
        public Item(string Name, int Sellin, int Quality)
        {
            this.name = Name;
            this.sellIn = Sellin;
            this.quality = Quality;
        }

        public string name { get; set; }
        public int sellIn { get; set; }
        public int quality { get; set; }
    }
}
