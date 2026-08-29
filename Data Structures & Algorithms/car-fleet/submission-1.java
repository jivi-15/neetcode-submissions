class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int car[][]=new int[n][2];

        for(int i=0;i<n;i++){
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }

        Arrays.sort(car,(a,b)->b[0]-a[0]);
        int fleet=0;
        double maxTime=0;

        for(int cars[]:car){
            double time=(double)(target-cars[0])/cars[1];

            if(time>maxTime){
                fleet++;
                maxTime=time;
            }
        }
        return fleet;
    }
}
