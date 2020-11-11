#ifndef Cinteresting
#define Cinteresting

#include "ExternalCalls.h"
#include "CUnbelievableComplexStruct.h"



 
    int cGlobalVariable;
    int cLongMethod(int param);
    int cMethodWithComplexParameters(CUnbelievableComplexStruct complexVariable);
    static int cGetSomethingFromDB(int param){return 10*param;}

#endif