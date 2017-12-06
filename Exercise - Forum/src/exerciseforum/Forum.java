package exerciseforum;

import java.util.ArrayList;

public class Forum {
	public String name;
	private ArrayList<Post> post;

	public Forum(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addPost(Post post) {
		this.post.add(post);
	}

	public void removePost(Post post) {
		this.post.remove(post);
	}

	public int getPostCount() {
		return this.post.size();
	}

	public ArrayList<Post> getPostsBy(String memberName) {
		ArrayList<Post> memberPost = new ArrayList<Post>();
		for (int i = 0; i < this.post.size(); i++) {
			Post p1 = this.post.get(i);
			if (p1.getMember().getName().equals(memberName))
				memberPost.add(this.post.get(i));
		}
		return memberPost;
	}
	public Forum copy() {
		return new Forum(name);
	}
}
