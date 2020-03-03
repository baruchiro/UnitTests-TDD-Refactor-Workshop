package com.gildedrose;

class UnInstantiableClass {
    public int internalVaribleA;
    public int internalVaribleB;
    public UnbelivableComplexClass complexVariable;

    UnInstantiableClass(UnbelivableComplexClass complexVariable) {
        complexVariable = complexVariable;
        internalVaribleA = complexVariable.getProfit();
    }

    public void methodA(int myParam) {
        int i;
        int sum = 0;
        if (myParam < 1)
            myParam = 10;
        for (i = 0; i < myParam * myParam; i++) {
            if (i < myParam + 50)
                sum = sum + i;
            else
                sum = sum + myParam;
        }
        internalVaribleA += sum;
    }

    public void methodB(int myParam) {
        internalVaribleB = myParam * 20;
    }

    public int getAmount() {
        return internalVaribleA + internalVaribleB;
    }
};