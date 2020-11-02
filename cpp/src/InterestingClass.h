#ifndef interesting
#define interesting

#include "ExternalCalls.h"
#include "UnbelivableComplexClass.h"



 int myA();

class InterestingClass
{
    int globalVariable;
public:
    InterestingClass() {globalVariable = 10;}
    

    int longMethod(int param);
    int methodWithComplexParameters(UnbelivableComplexClass *complexVariable);
    static int getSomethingFromDB(int param){return 10*param;}
};

#endif