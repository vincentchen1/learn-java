import java.util.Arrays;

class GetColN {

    public final static void main (String[] argv) {
        System.out.println("Hello");
        GetColN classUnderTest = new GetColN();
        //test1 
        int[][] numsTest1 = new int[][]{{-1,0},{7,9}};
        int[] col0 = classUnderTest.getColN(numsTest1, 0);
        System.out.println(Arrays.toString(col0));
        int[][] numsTest2 = new int[][]{{-1,2},{2,3},{3,4}};
        int[] col1 = classUnderTest.getColN(numsTest2,1);
        System.out.println(Arrays.toString(col1));
    }

    public int[] getColN(int[][] nums, int colN) {
        if (nums == null) return null;
        if (nums.length==0) return null;
        int numR = nums.length;
        int numC = nums[0].length;

        if (colN > (numC-1)) return null;
        
        int[] colArr = new int[numR];

        for (int r=0; r < numR; r++) {
            for (int c=0; c<numC; c++) {
                if (c == colN) {
                    colArr[r] = nums[r][c];
                }
            }
        }
        return colArr;
    }


}
