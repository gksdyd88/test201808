package test.no1s.googleSheetsApi;

/**
 * GoogleSheetsAPI�萔�N���X
 */
public class Constants {
	// ���s�R�[�h�iLF�j
	public static final String LINE_CODE_LF = "\n";
	
	// �V���O���N�H�[�e�[�V����
	public static final String SINGLE_QUOTATION = "'";
	
	// ��؂蕶���i�J���}�j
	public static final String DELIMITER_COMMA = "�C";
	// HTTP�X�e�[�^�X(����)
	public static final int HTTP_SUCCESS = 200;
	// API�pEnum
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
