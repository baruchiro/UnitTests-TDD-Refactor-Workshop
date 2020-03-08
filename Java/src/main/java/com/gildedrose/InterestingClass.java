package com.gildedrose;

class InterestingClass {
    int globalVariable;

    public InterestingClass() {
        globalVariable = 10;
    }

    void longMethod(int param) {
        int i;
        int sum = 0;

        // ....
        // ....
        // ....
        if (globalVariable < 1)
            globalVariable = 10;
        for (i = 0; i < param * globalVariable; i++) {
            if (i < globalVariable + param)
                sum = sum + i;
            else
                sum = sum + globalVariable;
        }

        // ....
        // ....
        // ....

        if (globalVariable < 1)
            globalVariable = getSomething(globalVariable);
        for (i = 0; i < param * param; i++) {
            if (i < globalVariable + 50)
                sum = sum + i;
            else
                sum = sum + param;
        }
        // ....
        // ....
        // ....
        if (globalVariable < ExternalCalls.getDB())
            globalVariable = getSomething(param);
        for (i = 0; i < globalVariable * globalVariable; i++) {
            if (i < globalVariable + 50)
                sum = sum + i;
            else
                sum = sum + globalVariable;
        }

        // ....
        // ....
        // ....

        ExternalCalls.updateDB(sum);

    }

    static int getSomething(int param) {
        return 10 * param;
    }
};