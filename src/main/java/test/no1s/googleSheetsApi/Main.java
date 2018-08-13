package test.no1s.googleSheetsApi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * GoogleSheetsAPI実行クラス
 */
public class Main {
	public static void main(String... args) {
		if (args.length < 1) {
			System.out.println("WARN : API-key is null, please input API-key");
			System.exit(0);
		}
		// APIキー取得
		String apiKey = args[0];
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		String getUrl = Utils.getUrl(apiKey);
		HttpGet request = new HttpGet(getUrl);
		
		CloseableHttpResponse response = null;
		try {
			// リクエスト実行
			response = httpClient.execute(request);
			
			int status = response.getStatusLine().getStatusCode();
			
			if (status == Constants.HTTP_SUCCESS) {
				// リクエスト成功
				ObjectMapper mapper = new ObjectMapper();
				ResponseEntity responseJson = mapper.readValue(EntityUtils.toString(
						response.getEntity(), StandardCharsets.UTF_8), ResponseEntity.class);
				
				// 結果表示
				System.out.println(Utils.getSheetValues(responseJson.values));
			} else {
				// リクエスト失敗
				System.out.println("WARN : Request failed. HTTP status code : " + status);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
