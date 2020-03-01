#include "ExternalCalls.h"

class InterestingClass
{
    int globalVariable;
public:
    InterestingClass() {globalVariable = 10;}
    

    void longMethod(int param);
    static int getSomething(int param){return 10*param;}
};