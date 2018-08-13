package test.no1s.googleSheetsApi;

/**
 * GoogleSheetsAPI定数クラス
 */
public class Constants {
	// 改行コード（LF）
	public static final String LINE_CODE_LF = "\n";
	
	// シングルクォーテーション
	public static final String SINGLE_QUOTATION = "'";
	
	// 区切り文字（カンマ）
	public static final String DELIMITER_COMMA = "，";
	// HTTPステータス(成功)
	public static final int HTTP_SUCCESS = 200;
	// API用Enum
	public static enum ApiEnum {
		URL_SHEET_ID("https://sheets.googleapis.com/v4/spreadsheets/"),
		URL_RANGE("/values/"),
		URL_API_KEY("?key="),
		SHEET_ID("11BCnspCt2Mut3nhc4WMY6CYTd0zF9C3eCzsk1AEpKLM"),
		RANGE("sales!A1:E6");
		
		private final String value;
		
		private ApiEnum(final String value) {
			this.value = value;
		}
		
		public String getValue() {
			return this.value;
		}
	}
}
