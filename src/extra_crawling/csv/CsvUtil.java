package extra_crawling.csv;

import java.util.List;

public interface CsvUtil {
	
	List<List<String>> readCsv(String filename, String separator, int skipLine);	// csv파일의 header
// List의 List를 String으로 만든다?
	
	List<List<String>> readCsv(String filename);
	List<List<String>> readCsv(String separator, int skipLine);
	List<List<String>> readCsv(String filename, String separator);
	
	
	void writeCsv(String filename, List<List<String>> dataList);
	void writeCsv(String filename, List<List<String>> dataList, String separator);
// Overloading 을 해서 위의 줄까지 불러왔을 때 해당이 안되면 String separator 를 부르게 함

}
