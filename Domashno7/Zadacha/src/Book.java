
public class Book implements Sellable, Readable, Addable {
	protected int words;
	protected String text;
	
	public Book(int words, String text){
		this.words = words;
		this.text = text;
		
	}
	
	
	
	
	
	public int getWords() {
		return words;
	}





	public void setWords(int words) {
		this.words = words;
	}





	public String getText() {
		return text;
	}





	public void setText(String text) {
		this.text = text;
	}





	public void countWords(){
		 String[] newWords = this.text.split(" ");			
		}





	@Override
	public void Add() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void Read() {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void Sell() {
		// TODO Auto-generated method stub
		
	}


}

