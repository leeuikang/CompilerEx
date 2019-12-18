package lib;

public class EditDistance {

	int Comparison(String word, String word2) {
		int len_word = word.length();
		int len_word2 = word2.length();
		int [][] dp = new int[len_word+1][len_word2+1];
		for (int i = 0; i<=len_word; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j<=len_word2; j++) {
			dp[0][j] = j;
		}
		for (int i = 0; i<len_word; i++) {
			char c = word.charAt(i);
			for(int j = 0; j<len_word2; j++) {
				char c2 = word2.charAt(j);
				if(c==c2) {
					dp[i+1][j+1] = dp[i][j];
				}else {
					int min;
					int replace = dp[i][j]+1;
					int insert = dp[i][j+1]+1;
					int delete = dp[i+1][j]+1;
					if( replace > insert) min=insert;
					else min=replace;
					if( min > delete) min=delete;
					dp[i+1][j+1] = min;
				}
			}
		}
		return dp[len_word][len_word2];
	}
}
