package test.no1s.googleSheetsApi;

import test.no1s.googleSheetsApi.Constants.ApiEnum;

/**
 * GoogleSheetsAPI���[�e�B���e�B�N���X
 */
public class Utils {
	
	/**
	 * �X�v���b�h�V�[�g��ǂݍ���URL���쐬����
	 * @param apiKey ����API�L�[
	 * @return�@���N�G�X�gURL
	 */
	public static String getUrl(String apiKey) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(ApiEnum.URL_SHEET_ID.getValue());
		sb.append(ApiEnum.SHEET_ID.getValue());
		sb.append(ApiEnum.URL_RANGE.getValue());
		sb.append(ApiEnum.RANGE.getValue());
		sb.append(ApiEnum.URL_API_KEY.getValue());
		sb.append(apiKey);
		
		return sb.toString();
	}
	
	/**
	 * JSON�Ŏ󂯎�����Z���̒l�𐮌`����
	 * @param values �Z���̒l
	 * @return ���`����������
	 */
	public static String getSheetValues(String[][] values) {
		StringBuilder sb = new StringBuilder();
		for (String[] valueList : values) {
			for (String value : valueList) {
				sb.append(Constants.SINGLE_QUOTATION);
				sb.append(value);
				sb.append(Constants.SINGLE_QUOTATION);
				sb.append(Constants.DELIMITER_COMMA);
			}
			sb.append(Constants.LINE_CODE_LF);
		}
		return sb.toString();
	}
}
