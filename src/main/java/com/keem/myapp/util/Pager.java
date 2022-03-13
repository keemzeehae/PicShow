package com.keem.myapp.util;

public class Pager {

	//화면에 보여줄 row갯수
	private Long row;
	
	//page 번호
	private Long page;
	
	//첫 row
	private Long startRow;
	
	//끝 row
	private Long lastRow;
	
	//----------JSP 사용 변수------------
	private Long startNum;
	private Long lastNum;
	
	private boolean pre;
	private boolean next;
	
	//---------------검색에서 사용하는 변수-----
	private String search;
	private String kind;
	
	public void makeRow() {
		this.startRow=(this.getPage()-1)*this.getRow()+1;
		this.lastRow=this.getPage()*this.getRow();
	}
	//그래서 총 row가 몇개야
	public void makeNum(Long totalCount) {
		//전체 page 갯수 구하기
		Long totalPage=totalCount/this.getRow();
		if(totalCount%this.getRow()!=0) {
			totalPage++;
		}
		// 블럭당 갯수( 한페이지당 보여지는 아래번호)
		Long perBlock=10L;
		
		// 전체 블럭의 갯수 (몇 묶음인지)
		Long totalBlock=totalPage/perBlock;
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
		
		// page번호로 현재 몇번째 Block인지 계산
		//1번 1-10
		//2번 11-20
		//page   block
		// 1       1
		// 2       1
		//....
		// 11      2
		//curBlock-> 현재 블럭 번호
		
		Long curBlock=this.getPage()/perBlock;
		if(this.getPage()%perBlock!=0) {
			curBlock++;
		}
		
		//curBlock으로 startNum lastNum 구하기 --------JSP에서 화면에 보이는
		this.startNum=(curBlock-1)*perBlock+1;
		this.lastNum=curBlock*perBlock;
		
		//이전, 다음 블럭의 유무를
		this.pre=false;
		if(curBlock>1) {
			this.pre=true;
		}
		
		this.next=false;
		if(totalBlock>curBlock) {
			this.next=true;
		}
		//현재블럭이 마지막 블럭번호와 같다면
		if(curBlock==totalBlock) {
			this.lastNum=totalPage;
		}
		
		
	}
	

	public Long getRow() {
		//null이 오거나 0이오거나 음수가 올때를 셋팅
		if(this.row==null||this.row<1) {
			this.row=10L;
		}
		return row;
	}

	public void setRow(Long row) {
		this.row = row;
	}

	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return page;
	}

	public void setPage(Long page) {
		this.page = page;
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return lastRow;
	}

	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public boolean isPre() {
		return pre;
	}
	public void setPre(boolean pre) {
		this.pre = pre;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public String getSearch() {
		//검색어가 없으면 search == null
		if(this.search==null){
			this.search="";
		}
		
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	
}
