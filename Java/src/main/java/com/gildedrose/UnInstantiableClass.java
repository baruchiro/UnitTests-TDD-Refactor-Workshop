package com.gildedrose;

class UnInstantiableClass {
    public int internalVariableA;
    public int internalVariableB;
    public UnbelivableComplexClass complexVariable;

    UnInstantiableClass(UnbelivableComplexClass complexVariable) {
        internalVariableA = complexVariable.getProfit();
    }

    public int methodA(int myParam) {
        int i;
        int sum = 0;
        if (myParam < 1)
            sum = 10;
        for (i = 0; i < myParam * myParam; i++) {
            if (i < myParam + 50)
                sum = sum + i;
            else
                sum = sum + myParam;
        }
        return sum;
    }

    public void methodB(int myParam) {
        internalVariableB = myParam * 20;
    }

    public int getAmount() {
        return internalVariableA + internalVariableB;
    }
};