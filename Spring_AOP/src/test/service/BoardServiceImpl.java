package test.service;

public class BoardServiceImpl implements BoardService{

	@Override
	public void insert() {
		System.out.println("게시글 정보를 저장합니다.");
		
	}

	@Override
	public void select() {
		System.out.println("게시글 목록을 불러옵니다.");
		
	}

}
