package ch06_class.sec05_Melon;

public class MelonChart {

	public static void main(String[] args) {
		Melon[] songs = new Melon[5];
		songs[0] = new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", "33,211");
		songs[1] = new Melon(2, "To. X", "태연", "To. X - The 5th Mini Album", "82,805");
		songs[2] = new Melon(3, "Perfect Night", "LE SSERAFIM (르세라핌)", "Perfect Nigh", "94,997");
		songs[3] = new Melon(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,538");
		songs[4] = new Melon(5, "에피소드", "이무진", "에피소드", "33,246");
		
		Melon[] songs2 = {
				new Melon(1, "비의 랩소디", "임재현", "비의 랩소디", "33,211"),
				new Melon(2, "To. X", "태연", "To. X - The 5th Mini Album", "82,805"),
				new Melon(3, "Perfect Night", "LE SSERAFIM (르세라핌)", "Perfect Nigh", "94,997"),
				new Melon(4, "Drama", "aespa", "Drama - The 4th Mini Album", "68,538"),
				new Melon(5, "에피소드", "이무진", "에피소드", "33,246")
		};
		for (Melon song: songs2)
			System.out.println(song);

	}

}
