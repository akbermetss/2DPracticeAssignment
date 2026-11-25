import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
        System.out.println("--- Task 1: Create and print ---");
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[row].length; col++) {
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 2 --------------------------------------------------
        System.out.println("--- Task 2: Access and modify ---");
        int[][] matrix2 = {
                {5, 10, 15},
                {20, 25, 30}
        };

        System.out.println("Element at [1][2]: " + matrix2[1][2]);

        matrix2[0][1] = 99;

        System.out.println("Updated 2D array:");
        for (int row = 0; row < matrix2.length; row++) {
            for (int col = 0; col < matrix2[row].length; col++) {
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Task 3 ----------------------------------------------------
        System.out.println("--- Task 3: Sum all elements ---");
        int[][] matrix3 = {
                {-3, 67, 17},
                {2, 54, 0},
                {88, -1, 9}
        };

        int sum = 0;
        for (int row = 0; row < matrix3.length; row++) {
            for (int col = 0; col < matrix3[row].length; col++) {
                sum = sum + matrix3[row][col];
                System.out.print(matrix3[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println();

        // Task 4 ------------------------------------------------
        System.out.println("--- Task 4: Count even and odd ---");
        int[][] matrix4 = {
                {2, 7, 4},
                {9, 12, 5},
                {8, 3, 6}
        };

        int evenCount = 0;
        int oddCount = 0;

        for (int row = 0; row < matrix4.length; row++) {
            for (int col = 0; col < matrix4[row].length; col++) {
                if (matrix4[row][col] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
                System.out.print(matrix4[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println();

        // Task 5 --------------------------------------------------
        System.out.println("--- Task 5: Minimum and maximum ---");
        int[][] matrix5 = {
                {16, 4, 19, 8},
                {25, 1, 14, 49},
                {7, 16, 3, 22}
        };

        int min = matrix5[0][0];
        int max = matrix5[0][0];

        for (int row = 0; row < matrix5.length; row++) {
            for (int col = 0; col < matrix5[row].length; col++) {
                int current = matrix5[row][col];
                if (current < min) {
                    min = current;
                }
                if (current > max) {
                    max = current;
                }
                System.out.print(matrix5[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("Smallest value: " + min);
        System.out.println("Largest value: " + max);
        System.out.println();

        // Task 6 --------------------------------------------------
        System.out.println("--- Task 6: Read input ---");
        int[][] matrix6 = new int[2][3];

        System.out.println("Enter 6 integers for a 2x3 matrix:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("Enter element [" + row + "][" + col + "]: ");
                matrix6[row][col] = scanner.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix6[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // TASK 7 ------------------------------------------
        System.out.println("--- Task 7: Column sums ---");
        int[][] m7 = {
                {56, 81, 39},
                {4, 2, 11},
                {43, 78, 90}
        };

        for (int row = 0; row < m7.length; row++) {
            for (int col = 0; col < m7[row].length; col++) {
                System.out.print(m7[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int col = 0; col < 3; col++) {
            int colSum = 0;
            for (int row = 0; row < 3; row++) {
                colSum = colSum + m7[row][col];
            }
            System.out.println("Sum of column " + col + ": " + colSum);
        }
        System.out.println();

        //TASK 8 -----------------------------------------------------------
        System.out.println("--- Task 8: Count values above a threshold ---");
        int[][] m8 = {
                {3, 12, 92},
                {84, 5, 25},
                {9, 37, 2}
        };

        System.out.print("Enter a threshold number: ");
        int threshold = scanner.nextInt();

        int aboveCount = 0;
        for (int row = 0; row < m8.length; row++) {
            for (int col = 0; col < m8[row].length; col++) {
                if (m8[row][col] > threshold) {
                    aboveCount++;
                }
            }
        }
        System.out.println("Values greater than " + threshold + ": " + aboveCount);
        System.out.println();

        //TASK 9 ----------------------------------------------------

        System.out.println("--- Task 9: Search for a value ---");
        int[][] m9 = {
                {10, 14, 17, 20, 25, 22, 29, 30},
                {40, 44, 46, 50, 55, 59, 60, 11},
                {70, 77, 777, 80, 81, 90, 99, 100},
                {101, 133, 160, 122, 167, 900, 231},
                {0, 1, 6, 8, 9, 7, 4, 3},
                {1567, 7865, 3456, 9876, 234, 1234, 9807, 2026},
                {54, 999, 33, 21, 18, 5, 2, 67}
        };

        System.out.print("Enter a value to search for: ");
        int target = scanner.nextInt();

        boolean found = false;
        int foundRow = -1;
        int foundCol = -1;

        for (int row = 0; row < m9.length; row++) {
            for (int col = 0; col < m9[row].length; col++) {
                if (m9[row][col] == target && found == false) {
                    found = true;
                    foundRow = row;
                    foundCol = col;
                }
            }
        }

        if (found) {
            System.out.println("First match found at row " + foundRow + ", column " + foundCol);
        } else {
            System.out.println("Not found");
        }
        System.out.println();

        //TASK 10 -------------------------------------------------
        System.out.println("--- Task 10: Main diagonal sum ---");
        int[][] m10 = {
                {4, 2, 1},
                {5, 8, 3},
                {6, 7, 9}
        };

        for (int row = 0; row < m10.length; row++) {
            for (int col = 0; col < m10[row].length; col++) {
                System.out.print(m10[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int diagSum = 0;
        System.out.print("Main diagonal values: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(m10[i][i] + " ");
            diagSum = diagSum + m10[i][i];
        }
        System.out.println();
        System.out.println("Main diagonal sum: " + diagSum);
        System.out.println();

        //TASK 11 --------------------------------------------------
        System.out.println("--- Task 11: Replace negatives ---");
        int[][] m11 = {
                {5, -3, 8},
                {-1, 0, -7},
                {4, -9, 2}
        };

        System.out.println("Before:");
        for (int row = 0; row < m11.length; row++) {
            for (int col = 0; col < m11[row].length; col++) {
                System.out.print(m11[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < m11.length; row++) {
            for (int col = 0; col < m11[row].length; col++) {
                if (m11[row][col] < 0) {
                    m11[row][col] = 0;
                }
            }
        }
        System.out.println();

        System.out.println("After:");
        for (int row = 0; row < m11.length; row++) {
            for (int col = 0; col < m11[row].length; col++) {
                System.out.print(m11[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //TASK 12 -----------------------------------------------
        System.out.println("--- Task 12: Student grades ---");
        int[][] grades = {
                {80, 90, 85, 95},
                {70, 75, 80, 75},
                {90, 88, 92, 90}
        };

        int totalSum = 0;
        int totalCount = 0;
        int classMax = grades[0][0];

        for (int row = 0; row < grades.length; row++) {
            int studentSum = 0;
            for (int col = 0; col < grades[row].length; col++) {
                int score = grades[row][col];
                studentSum = studentSum + score;
                totalSum = totalSum + score;
                totalCount++;

                if (score > classMax) {
                    classMax = score;
                }
            }
            double studentAvg = (double) studentSum / grades[row].length;
            System.out.println("Student " + (row + 1) + " average: " + studentAvg);
        }

        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Class maximum score: " + classMax);
        System.out.println("Overall class average: " + overallAvg);
        System.out.println();

        // Optional A -------------------------------------------------

        System.out.println("--- Optional A: Largest row sum ---");
        int[][] mA = {
                {3, 55, 2, 63},
                {10, 12, 81, 4},
                {7, 100, 9, 15}
        };
        for (int row = 0; row < mA.length; row++) {
            for (int col = 0; col < mA[row].length; col++) {
                System.out.print(mA[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int bestRow = 0;
        int maxRowSum = 0;

        for (int col = 0; col < mA[0].length; col++) {
            maxRowSum = maxRowSum + mA[0][col];
        }

        for (int row = 1; row < mA.length; row++) {
            int currentRowSum = 0;
            for (int col = 0; col < mA[row].length; col++) {
                currentRowSum = currentRowSum + mA[row][col];
            }
            if (currentRowSum > maxRowSum) {
                maxRowSum = currentRowSum;
                bestRow = row;
            }
        }
        System.out.println("Row with largest sum: row " + bestRow + " (sum = " + maxRowSum + ")");
        System.out.println();

        // Optional B ------------------------------------------------
        System.out.println("--- Optional B: Transpose ---");
        int[][] original = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Original 2x2 matrix: ");
        for (int row = 0; row < original.length; row++) {
            for (int col = 0; col < original[row].length; col++) {
                System.out.print(original[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] transposed = new int[3][2];

        for (int row = 0; row < original.length; row++) {
            for (int col = 0; col < original[row].length; col++) {
                transposed[col][row] = original[row][col];
            }
        }

        System.out.println("Transposed 3x2 matrix:");
        for (int row = 0; row < transposed.length; row++) {
            for (int col = 0; col < transposed[row].length; col++) {
                System.out.print(transposed[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Optional C ------------------------------------------------
        System.out.println("--- Optional C: Add two matrices ---");
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("First matrix: ");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Second matrix: ");
        int[][] b = {
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                System.out.print(b[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] result = new int[2][3];

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                result[row][col] = a[row][col] + b[row][col];
            }
        }

        System.out.println("Sum matrix (2x3):");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}