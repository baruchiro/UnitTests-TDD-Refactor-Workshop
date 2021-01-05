using System;
using System.Collections.Generic;
using System.IO;

namespace Gildedrose
{
    public class GildedRoseManager
    {
        public IList<Item> Items = new List<Item> { };
        public void Run()
        {
            char option = '0';
            Console.Write("Welcome to Guilded Rose inventory management\n");
            Console.Write("********************************************\n");
            while (true)
            {
                Console.Write("Options:\n");
                Console.Write("    Add Items: 1-Brie, 2-Backstage pass, 3-Sulfuras, 4-Beer\n");
                Console.Write("    0-Tick (advance a day), 9-Exit\n");
                try
                {
                    option = Console.ReadLine()[0];
                }
                catch (IOException e)
                {
                    Console.Write("Error reading from user:" + e);
                }
                if (option == '9')
                {
                    return;
                }
                ProcessOption(option);

                if (Items.Count >= 0)
                {
                    Console.Write("Current Inventory:\n");

                    for (int i = 0; i < Items.Count; i++)
                    {
                        Console.Write("SellIn:" + Items[i].SellIn + ", Quality:" + Items[i].Quality + ", Name: " + Items[i].Name + "\n");
                    }
                }
            }
        }

        public void ProcessOption(char option)
        {
            switch (option)
            {
                case '1':
                    Items.Add(new Item("Aged Brie", 15, 20));
                    ExternalAgencyReporter.ReportItem(Items[Items.Count - 1]);
                    break;
                case '2':
                    Items.Add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
                    ExternalAgencyReporter.ReportItem(Items[Items.Count - 1]);
                    break;
                case '3':
                    Items.Add(new Item("Sulfuras, Hand of Ragnaros", 15, 20));
                    ExternalAgencyReporter.ReportItem(Items[Items.Count - 1]);
                    break;
                case '4':
                    Items.Add(new Item("Beer", 15, 20));
                    ExternalAgencyReporter.ReportItem(Items[Items.Count - 1]);
                    break;
                case '0':
                    for (int i = 0; i < Items.Count; i++)
                    {
                        if (!Items[i].Name.Equals("Aged Brie")
                                && !Items[i].Name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                        {
                            if (Items[i].Quality > 0)
                            {
                                if (!Items[i].Name.Equals("Sulfuras, Hand of Ragnaros"))
                                {
                                    Items[i].Quality = Items[i].Quality - 1;
                                }
                            }
                        }
                        else
                        {
                            if (Items[i].Quality < 50)
                            {
                                Items[i].Quality = Items[i].Quality + 1;

                                if (Items[i].Name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                                {
                                    if (Items[i].SellIn < 11)
                                    {
                                        if (Items[i].Quality < 50)
                                        {
                                            Items[i].Quality = Items[i].Quality + 1;
                                        }
                                    }

                                    if (Items[i].SellIn < 6)
                                    {
                                        if (Items[i].Quality < 50)
                                        {
                                            Items[i].Quality = Items[i].Quality + 1;
                                        }
                                    }
                                }
                            }
                        }

                        if (!Items[i].Name.Equals("Sulfuras, Hand of Ragnaros"))
                        {
                            Items[i].SellIn = Items[i].SellIn - 1;
                        }

                        if (Items[i].SellIn < 0)
                        {
                            if (!Items[i].Name.Equals("Aged Brie"))
                            {
                                if (!Items[i].Name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                                {
                                    if (Items[i].Quality > 0)
                                    {
                                        if (!Items[i].Name.Equals("Sulfuras, Hand of Ragnaros"))
                                        {
                                            Items[i].Quality = Items[i].Quality - 1;
                                        }
                                    }
                                }
                                else
                                {
                                    Items[i].Quality = Items[i].Quality - Items[i].Quality;
                                }
                            }
                            else
                            {
                                if (Items[i].Quality < 50)
                                {
                                    Items[i].Quality = Items[i].Quality + 1;
                                }
                            }
                        }
                    }
                    break;

            }
        }


    }


}