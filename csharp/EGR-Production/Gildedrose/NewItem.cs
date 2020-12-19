using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Gildedrose
{
    interface NewItem
    {
        String getDescription();
        int getCurrentQuality();
        int getExpiredInDays();
    }
}
