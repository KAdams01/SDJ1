package exerciseforum;


public class Post {
	private String content;
	private Member member;
	private MyDate date;
	
	public Post(String content, Member member, MyDate date) {
		this.content=content;
		this.member=member;
		this.date=date;
	}
	public String getContent() {
		return content;
	}
	public Member getMember() {
		return member;
	}
	public MyDate getDate() {
		return date;
	}
	public void edit(String content) {
		this.content=content;
	}
	public String toString() {
		return content + member + date;
	}
}
