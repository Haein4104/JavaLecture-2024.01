package extra_api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

/**
 * 도로명주소로부터 위도(latitude), 경도(longitude) 정보를 찾아주는 메소드
 */
public class KakaoLocalApi {

	public Map<String, Double> getGeocode(String addr) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c:/Temp/KakaoApiKey.txt")); // 한글자씩 읽게 하자
		String kakaoKey = br.readLine();
		br.close();
		String query = URLEncoder.encode(addr, "utf-8");
		String apiUrl = "https://dapi.kakao.com/v2/local/search/address.json"
						+ "?query=" + query;
		
		URL url = new URL(apiUrl);
		// header 설정
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestProperty("Authorization", "KakaoAK " + kakaoKey);
		conn.setDoInput(true);
		conn.setUseCaches(false);
		conn.setDefaultUseCaches(false);
		
		// 응답결과 확인
		int responseCode = conn.getResponseCode();
		System.out.println(responseCode);
		
		br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer();
		String line = null;
		while ((line = br.readLine()) !=null)
			sb.append(line);
		br.close();
		System.out.println(sb.toString());
		
//		URI uri = new URI(apiUrl);
//		// header 설정
//		HttpHeaders headers = new HttpHeaders;
		
		return null;
	}
}
