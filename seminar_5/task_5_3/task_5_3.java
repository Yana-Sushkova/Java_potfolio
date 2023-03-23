/* На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
    И вывести Доску. Пример вывода доски 8x8

    0x000000
    0000x000
    00x00000
 */
package seminar_5.task_5_3;

public class task_5_3 {
    public static void main(final String[] args) throws Exception {
        for (int cnt = 1; cnt <= 10000; cnt++) {
            System.out.print(cnt + " ");
            final char[][] board = createEmptyСhessboard();
            putQueensToСhessboard(board);
            // final char[][] board = createValidСhessboard();
            if (checkСhessboard(board)) {
                System.out.println();
                printСhessboard(board);
                break;
            }
        }
    }

    private static void printСhessboard(final char[][] board) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    private static char[][] createEmptyСhessboard() {
        final char[][] board = new char[8][8];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = '0';
            }
        }
        return board;
    }

    private static char[][] createValidСhessboard() {
        final char[][] board = new char[8][8];
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                board[x][y] = '0';
            }
        }
        board[0][5] = 'X';
        board[1][2] = 'X';
        board[2][4] = 'X';
        board[3][6] = 'X';
        board[4][0] = 'X';
        board[5][3] = 'X';
        board[6][1] = 'X';
        board[7][7] = 'X';
        return board;
    }

    private static char[][] putQueensToСhessboard(final char[][] board) {
        for (int x = 0; x < board.length; x++) {
            board[x][(int) (Math.random() * (7))] = 'X';
        }
        return board;
    }

    private static boolean checkСhessboard(final char[][] board) {
        for (int x = 0; x < board.length; x++) { // проверка пересечений по X
            int cnt = 0;
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == 'X' && (++cnt > 1)) {
                    return false;
                }
            }
        }

        for (int x = 0; x < board.length; x++) { // проверка пересечений по Y
            int cnt = 0;
            for (int y = 0; y < board[x].length; y++) {
                if (board[y][x] == 'X' && (++cnt > 1)) {
                    return false;
                }
            }
        }

        for (int x = 0; x < board.length; x++) { // проверка пересечений по диагонали
            for (int y = 0; y < board[x].length; y++) {
                if ((x == 0 && y == 0)
                        || (x == board.length - 1 && y == board.length - 1)
                        || (x == board.length - 1 && y == 0)
                        || (x == 0 && y == board.length - 1)) {
                    continue;
                }

                int cnt = 0;
                int tmpX = x;
                int tmpY = y;
                while (tmpX >= 0 && tmpY < board.length) {
                    if (board[tmpX--][tmpY++] == 'X' && (++cnt > 1)) {
                        return false;
                    }
                }

                cnt = 0;
                tmpX = x;
                tmpY = y;
                while (tmpX < board.length && tmpY < board.length) {
                    if (board[tmpX++][tmpY++] == 'X' && (++cnt > 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
