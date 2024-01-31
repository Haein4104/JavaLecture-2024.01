package extra_api;

import java.util.Map;

public class MapMain {

	public static void main(String[] args) throws Exception {
		RoadAddrApi roadApi = new RoadAddrApi();
		KakaoLocalApi kakaoApi = new KakaoLocalApi();
		
		String[] places = {"경기도청", "팔달구청", "장안구청", "영통구청", "권선구청"};
		for (String place: places) {
			String roadAddr = roadApi.getRoadAddr(place);
			// Map 을 만들어서 위도, 경도를 같이 보여줌
			Map<String, Double> geoCode = kakaoApi.getGeocode(roadAddr);
			System.out.printf("%s: %s, %.6f, %.6f%n", place, roadAddr, geoCode.get("lat"), geoCode.get("lon"));
		}

	}

}

// return 은 결과를 리스트의 형태로 보여줌. 그래서 값을 정확하게 인지하기 힘들 수도? 있음
// map 으로 보여주면 각 값에 정확한 태그를 붙여주니까 알기가 쉬움