using System;
using System.Collections.Generic;
using System.IO;

namespace Gildedrose
{
    public class GildedRoseManager
    {
        IList<Item> items = new List<Item> { };
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
                    Console.Write("Error reading from user:"+e);
                }
                if (option == '9')
                {
                    return;
                }
                switch (option)
                {
                    case '1':
                        items.Add(new Item("Aged Brie", 15, 20));
                        break;
                    case '2':
                        items.Add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
                        break;
                    case '3':
                        items.Add(new Item("Sulfuras, Hand of Ragnaros", 15, 20));
                        break;
                    case '4':
                        items.Add(new Item("Beer", 15, 20));
                        break;
                    case '0':
                        for (int i = 0; i < items.Count; i++)
                        {
                            if (!items[i].name.Equals("Aged Brie")
                                    && !items[i].name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                            {
                                if (items[i].quality > 0)
                                {
                                    if (!items[i].name.Equals("Sulfuras, Hand of Ragnaros"))
                                    {
                                        items[i].quality = items[i].quality - 1;
                                    }
                                }
                            }
                            else
                            {
                                if (items[i].quality < 50)
                                {
                                    items[i].quality = items[i].quality + 1;

                                    if (items[i].name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                                    {
                                        if (items[i].sellIn < 11)
                                        {
                                            if (items[i].quality < 50)
                                            {
                                                items[i].quality = items[i].quality + 1;
                                            }
                                        }

                                        if (items[i].sellIn < 6)
                                        {
                                            if (items[i].quality < 50)
                                            {
                                                items[i].quality = items[i].quality + 1;
                                            }
                                        }
                                    }
                                }
                            }

                            if (!items[i].name.Equals("Sulfuras, Hand of Ragnaros"))
                            {
                                items[i].sellIn = items[i].sellIn - 1;
                            }

                            if (items[i].sellIn < 0)
                            {
                                if (!items[i].name.Equals("Aged Brie"))
                                {
                                    if (!items[i].name.Equals("Backstage passes to a TAFKAL80ETC concert"))
                                    {
                                        if (items[i].quality > 0)
                                        {
                                            if (!items[i].name.Equals("Sulfuras, Hand of Ragnaros"))
                                            {
                                                items[i].quality = items[i].quality - 1;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        items[i].quality = items[i].quality - items[i].quality;
                                    }
                                }
                                else
                                {
                                    if (items[i].quality < 50)
                                    {
                                        items[i].quality = items[i].quality + 1;
                                    }
                                }
                            }
                        }
                        break;

                }


                if (items.Count >= 0)
                {
                    Console.Write("Current Inventory:\n");

                    for (int i = 0; i < items.Count; i++)
                    {
                        Console.Write("SellIn:" + items[i].sellIn + ", Quality:" + items[i].quality + ", Name: " + items[i].name+"\n");
                    }
                }
            }
        }


    }


    }