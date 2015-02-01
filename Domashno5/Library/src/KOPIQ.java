public class KOPIQ {
	Book book;
	int kopiq;

	public KOPIQ(Book book, int kopiq) {
		super();
		this.book = book;
		this.kopiq = kopiq;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getKopiq() {
		return kopiq;
	}

	public void setKopiq(int kopiq) {
		this.kopiq = kopiq;
	}

	@Override
	public String toString() {
		return "KOPIQ [getBook()=" + getBook() + ", getKopiq()=" + getKopiq()
				+ "]";
	}
}
