#ifndef interesting
#define interesting

#include "ExternalCalls.h"
#include "UnbelievableComplexClass.h"



 int myA();

class InterestingClass
{
    int globalVariable;
public:
    InterestingClass() {globalVariable = 10;}
    

    int longMethod(int param);
    int methodWithComplexParameters(UnbelievableComplexClass *complexVariable);
    static int getSomethingFromDB(int param){return 10*param;}
};

#endif