package co.edu.api;

public class ResourceExample {
	public static void main(String[] agrs) {
		
		Class cls = ClassEx.class;
		String path = cls.getResource("sample.txt").getPath();  //어떤경로로 파일을 읽어오는지 보여쥼(안뜰땐 파일 - 보기 - 파일확장명)
		
		System.out.println("경로: " + path);
	}
}
