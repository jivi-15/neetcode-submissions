class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalG=0;
        int totalC=0;
        int start=0;
        int tank=0;

        for(int i=0;i<gas.length;i++){
            totalG+=gas[i];
            totalC+=cost[i];

            tank+=gas[i]-cost[i];

            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(totalG<totalC){
            return -1;
        }
        return start;
    }
}
