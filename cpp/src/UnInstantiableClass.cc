#include "UnInstantiableClass.h"

void UnInstantiableClass::methodA(int myParam){
    int i;
    int sum=0;
    if (myParam<1)
        myParam = 10;
    for (i=0;i<myParam*myParam;i++){
        if (i<myParam+50)
            sum=sum+i;
        else
            sum=sum+myParam;
    }
    internalVaribleA = sum;
}

void UnInstantiableClass::methodB(int myParam){
    internalVaribleB = myParam*20;
}

int UnInstantiableClass::getAmount(){
    return internalVaribleA+internalVaribleB;
}