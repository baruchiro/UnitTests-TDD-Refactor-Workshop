using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EGR_Production
{
    interface CustomerAccount
    {
        void createOrder(CustomerOrder order);
        int getOrderStatus();
    }
}
