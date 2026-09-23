class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int tsec=0;
        tsec += requests[0];
        for(int i=1;i<requests.length;i++){
            tsec += Math.abs(requests[i-1]-requests[i]);
        }
        return tsec;
    }
}