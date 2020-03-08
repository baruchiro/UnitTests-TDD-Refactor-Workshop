#include "UnbelivableComplexClass.h"

class UnInstantiableClass
{
public:
    int internalVaribleA;
    int internalVaribleB;
    UnbelivableComplexClass complexVariable;

    UnInstantiableClass(UnbelivableComplexClass complexVariable) : complexVariable(complexVariable)
    {internalVaribleA = complexVariable.getProfit();}

    void methodA(int myParam);
    void methodB(int myParam);
    int getAmount();
};