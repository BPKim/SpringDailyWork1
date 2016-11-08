package exam_01_aggregation;

// DTO를 만들 수 있는 class
// Database를 근간으로 해서 만들어요
// Entity : 데이터를 보관
public class BookEntity {

	private String bisbn;
	private String btitle;
	private String bauthor;
	private int bprice;

	public BookEntity() {
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	
}
