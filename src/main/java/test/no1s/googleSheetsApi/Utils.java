package test.no1s.googleSheetsApi;

import test.no1s.googleSheetsApi.Constants.ApiEnum;

/**
 * GoogleSheetsAPIユーティリティクラス
 */
public class Utils {
	
	/**
	 * スプレッドシートを読み込むURLを作成する
	 * @param apiKey 入力APIキー
	 * @return　リクエストURL
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
	 * JSONで受け取ったセルの値を整形する
	 * @param values セルの値
	 * @return 整形した文字列
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
