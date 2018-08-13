package test.no1s.googleSheetsApi;

import java.util.Arrays;

/**
 * レスポンスJSON格納クラス
 */
public class ResponseEntity {
	
	public String range;
	
	public String majorDimension;

	public String[][] values;
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ResponseEntity [range : ");
		sb.append(range);
		sb.append(", + majorDimension : ");
		sb.append(majorDimension);
		sb.append(", + values : ");
		sb.append(Arrays.deepToString(values));
		sb.append("]");
		
		return sb.toString(); 
	}
}
