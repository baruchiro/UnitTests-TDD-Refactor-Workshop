#include "ExternalCalls.h"

class InterestingClass
{
    int globalVariable;
public:
    InterestingClass() {globalVariable = 10;}
    

    int longMethod(int param);
    static int getSomethingFromDB(int param){return 10*param;}
};