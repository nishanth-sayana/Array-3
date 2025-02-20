//Time Complexity=O(n)
//Space Complexity=O(n)
public class HIndex {

    public int hIndex(int[] citations) {
        int n=citations.length;
        int[] buckets=new int[n+1];

        for(int i=0;i<n;i++){
            if(citations[i]>n){
                buckets[n]++;
            }else{
                buckets[citations[i]]++;
            }
        }

        int sum=0;
        for(int i=n;i>=0;i--){
            sum+=buckets[i];
            if(sum>=i){
                return i;
            }
        }
        return 0;
    }
}
