package exam_01_aggregation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 입력받고
		Scanner s = new Scanner(System.in);
		System.out.print("검색할 키워드 : ");
		String keyword = s.nextLine();

		// 로직처리하고
		// 로직처리를위한 service객체를 생성
		// 나중에 DB처리를 위해서 DAO객체를 생성
		BookDAO dao = new BookDAO();
		BookService service = new BookService(dao);
		
		// 서비스를 이용해서 business logic을 수행 
		ArrayList<BookEntity> list = service.getListByKeyword(keyword);
		
		// 출력처리
		for(BookEntity entity : list){
			System.out.println(entity.getBtitle() + " : "+ entity.getBauthor());
			
		}
		
		// 사용한 resource 해제 
		
		s.close();
	}

}
