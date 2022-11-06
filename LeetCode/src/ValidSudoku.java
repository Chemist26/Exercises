import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	  public static boolean isValidSudoku(char[][] board) {
	        Set<Object> checked = new HashSet<>();
	        
	        for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
	                 char number = board[i][j];
	                 if (number != '.') {
	                	 if (!checked.add(number + " in row " + i) ||
	                		 !checked.add(number + " in column " + j) ||
	                	     !checked.add(number + " in block " + i/3 + "-" + j/3))
	                		 return false;
	                 }
				}
			}
	        
	        return true;
	    }
	  
	  public static void main(String[] args) {
		  /*
		   * '4' in row 7 is encoded as "(4)7".
           * '4' in column 7 is encoded as "7(4)".
           * '4' in the top-right block is encoded as "0(4)2".
		   */
		char[][] board = {{'8','3','.','.','7','.','.','.','.'}
				         ,{'6','.','.','1','9','5','.','.','.'}
				         ,{'.','9','8','.','.','.','.','6','.'}
				         ,{'8','.','.','.','6','.','.','.','3'}
				         ,{'4','.','.','8','.','3','.','.','1'}
				         ,{'7','.','.','.','2','.','.','.','6'}
				         ,{'.','6','.','.','.','.','2','8','.'}
				         ,{'.','.','.','4','1','9','.','.','5'}
				         ,{'.','.','.','.','8','.','.','7','9'}};
		
		System.out.println(isValidSudoku(board));
		}
	}