class column_print {

    public static void main(String args[]) {

        int[][] arr = {
            {1, 2, 3},
            {4, 6},
            {7, 8, 9, 10}
        };

        // Row-wise printing
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb1.append(arr[i][j]).append(" ");
            }
            sb1.append("\n");
        }

        System.out.println("Row-wise printing:");
        System.out.println(sb1.toString());

        // Column-wise printing
        System.out.println("Column-wise printing:");

        StringBuffer sb = new StringBuffer();

        // Find max columns
        int maxCols = 0;
        for (int i = 0; i < arr.length; i++) {
            maxCols = Math.max(maxCols, arr[i].length);
        }

        // Column-wise traversal
        for (int j = 0; j < maxCols; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j < arr[i].length) {   // safety check
                    sb.append(arr[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
