package com.exercise.project.exerciseproject.ztm.dynamic.programming;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SudokuSolverService {
    public void solveSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    Set<Character> rowChars;
                    if (rows.containsKey(i)) {
                        rowChars = rows.get(i);
                    } else {
                        rowChars = new HashSet<>();
                    }
                    rowChars.add(board[i][j]);
                    rows.put(i, rowChars);

                    if (columns.containsKey(j)) {
                        Set<Character> characters = columns.get(j);
                        characters.add(board[i][j]);
                        columns.put(j, characters);
                    } else {
                        Set<Character> characters = new HashSet<>();
                        characters.add(board[i][j]);
                        columns.put(j, characters);
                    }

                    int squareIndex = getSquareIndex(i, j);

                    Set<Character> characters;
                    if (squares.containsKey(squareIndex)) {
                        characters = squares.get(squareIndex);
                    } else {
                        characters = new HashSet<>();
                    }
                    characters.add(board[i][j]);
                    squares.put(squareIndex, characters);
                }
            }
        }

        solveSudoku(board, 0, 0, rows, columns, squares);

        for (Map.Entry<Integer, Set<Character>> r : rows.entrySet()) {
            System.out.println(r);
        }
    }


    private boolean solveSudoku(char[][] board, int row, int column, Map<Integer, Set<Character>> rows, Map<Integer, Set<Character>> columns, Map<Integer, Set<Character>> squares) {
        if (row == board.length || column == board[row].length) {
            return true;
        } else {
            if (board[row][column] == '.') {
                for (int num = 1; num <= 9; num++) {
                    char numValue = (char) ('0' + num);
                    board[row][column] = numValue;

                    if (isValid(rows.get(row), columns.get(column), squares.get(getSquareIndex(row, column)), numValue)) {
                        rows.get(row).add(numValue);
                        columns.get(column).add(numValue);
                        squares.get(getSquareIndex(row, column)).add(numValue);
                        if (column == 8) {
                            if (solveSudoku(board, row + 1, 0, rows, columns, squares)) {
                                return true;
                            }
                        } else {
                            if (solveSudoku(board, row, column + 1, rows, columns, squares)) {
                                return true;
                            }
                        }

                    } else {
                        rows.get(row).remove(numValue);
                        columns.get(column).remove(numValue);
                        squares.get(getSquareIndex(row, column)).remove(numValue);
                    }
                    board[row][column] = '.';
                }
            } else {

                if (column == 8) {
                    if (solveSudoku(board, row + 1, 0, rows, columns, squares)) {
                        return true;
                    }
                } else {
                    if (solveSudoku(board, row, column + 1, rows, columns, squares)) {
                        return true;
                    }
                }
            }
            return true;
        }


    }

    private boolean isValid(Set<Character> rows, Set<Character> columns, Set<Character> squares, char value) {
        return !rows.contains(value) && !columns.contains(value) && !squares.contains(value);
    }

    private int getSquareIndex(int i, int j) {
        if ((i == 0 || i == 1 || i == 2) && (j == 0 || j == 1 || j == 2)) {
            return 0;
        } else if ((i == 0 || i == 1 || i == 2) && (j == 3 || j == 4 || j == 5)) {
            return 1;
        } else if ((i == 0 || i == 1 || i == 2) && (j == 6 || j == 7 || j == 8)) {
            return 2;
        } else if ((i == 3 || i == 4 || i == 5) && (j == 0 || j == 1 || j == 2)) {
            return 3;
        } else if ((i == 3 || i == 4 || i == 5) && (j == 3 || j == 4 || j == 5)) {
            return 4;
        } else if ((i == 3 || i == 4 || i == 5) && (j == 6 || j == 7 || j == 8)) {
            return 5;
        } else if ((i == 6 || i == 7 || i == 8) && (j == 0 || j == 1 || j == 2)) {
            return 6;
        } else if ((i == 6 || i == 7 || i == 8) && (j == 3 || j == 4 || j == 5)) {
            return 7;
        } else {
            return 8;
        }

    }

    private Optional<int[]> findNextFreeField(char[][] board, int i, int j) {
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == '.') {
                    return Optional.of(new int[]{x, y});
                }
            }
        }
        return Optional.empty();
    }

    private void print(char[][] boards) {
        for (int i = 0; i < boards.length; i++) {
            for (int j = 0; j < boards[i].length; j++) {
                System.out.print(boards[i][j] + " ");
            }
            System.out.println();
        }
    }

}
