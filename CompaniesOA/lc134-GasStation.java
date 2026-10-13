class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
        }

        for (int i = 0; i < cost.length; i++) {
            totalCost += cost[i];
        }

        if (totalCost > totalGas) {
            return -1;
        }

        int balance = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            balance = balance + gas[i] - cost[i];

            if (balance < 0) {
                start = i + 1;
                balance = 0;
            }
        }

        return start;
    }
}
