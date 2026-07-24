class Solution {
    public int heightChecker(int[] heights) {
        int[] copyArr = heights.clone();
        Arrays.sort(copyArr);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=copyArr[i]){
                count++;
            }
        }
        return count;
    }
}