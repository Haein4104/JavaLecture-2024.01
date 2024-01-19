package ch06_class.sec05_Melon;

public class MelonChart {

	public static void main(String[] args) {
		// 기본 생성자로 객체를 생성하고, Setter로 필드값을 지정
		Melon[] songs = new Melon[5];
		songs[0] = new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", "33,211");
		songs[1] = new Melon(2, "To. X", "태연", "To. X - The 5th Mini Album", "82,805");
		songs[2] = new Melon(3, "Perfect Night", "LE SSERAFIM (르세라핌)", "Perfect Nigh", "94,997");
		songs[3] = new Melon(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,538");
		songs[4] = new Melon(5, "에피소드", "이무진", "에피소드", "33,246");
		
		Melon[] songs2 = {
				new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", "33,211"),
				new Melon(2, "To. X", "태연", "To. X - The 5th Mini Album", "82,805"),
				new Melon(3, "Perfect Night", "LE SSERAFIM (르세라핌)", "Perfect Night", "94,997"),
				new Melon(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,538"),
				new Melon(5, "에피소드", "이무진", "에피소드", "33,246")
		};
		for (Melon song: songs2)
			System.out.println(song);
		
		// 실전에서 사용하는 코드
/*		List<Melon> list = new ArrayList<>();
 * 		List.add(songs); list.add(songs2);
 * 		list.add(new Melon(3, "Perfect Night", "LE SSERAFIM (르세라핌)", "Perfect Nigh", "94,997"));
 * 		list.add(new Melon(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,538"));
 * 		:
 * 		for (Melon mc: list)
 * 		System.out.println(mc);
 * 		// or
 * 		list.forEach(x -> System.out.println(x));		<- 람다 함수
 * 
 */

	}

}
