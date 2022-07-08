package co.edu.interfaces.database;

public class Oracle implements Dao {
//           알맹이  /         껍대깅
	@Override
	public void insert() {
		System.out.println("Oravle 입력합니다. ");
		
	}

	@Override
	public void update() {
		System.out.println("Oravle 수정합니다. ");
		
	}

	@Override
	public void delete() {
		System.out.println("Oravle 삭제합니다. ");
		
	}

}
