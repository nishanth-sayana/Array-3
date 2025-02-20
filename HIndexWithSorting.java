import java.util.Arrays;

//Time complexity=O(NLogN)
//Space Complexity=O(1)
public class HIndexWithSorting {

    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<n;i++){
            int diff=n-i;
            if(citations[i]>=diff){
                return diff;
            }
        }
        return 0;
    }
}
