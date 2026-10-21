class Solution {
    public double average(int[] salary) {
        double ans=0;
        double total=0;
        int n=salary.length;
        for(int i=0;i<n;i++){
            total += (double)salary[i];
        }
        double smallest=salary[0],largest=salary[0];
        for(int i=1;i<n;i++){
            if(salary[i]>largest)
                largest=(double)salary[i];
            if(salary[i]<smallest)
                smallest=(double)salary[i];
        }
        return (total-(largest+smallest))/(n-2);
    }
}