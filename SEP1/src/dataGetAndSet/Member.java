package dataGetAndSet;

public class Member {
	private String memberFirstName, memberLastName, memberAddress, memberEmail, memberCoursePreference;
	private int memberPhone;

	public Member(String firstName, String lastName, String address, String email, String coursePref, int phone) {
		this.memberFirstName = firstName;
		this.memberLastName = lastName;
		this.memberAddress = address;
		this.memberEmail = email;
		this.memberCoursePreference = coursePref;
		this.memberPhone = phone;
	}

	public Member(String firstName, String lastName) {
		this.memberFirstName = firstName;
		this.memberLastName = lastName;
	}

	public String getMemberFirstName() {
		return memberFirstName;
	}

	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}

	public String getMemberLastName() {
		return memberLastName;
	}

	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberCoursePreference() {
		return memberCoursePreference;
	}

	public void setMemberCoursePreference(String memberCoursePreference) {
		this.memberCoursePreference = memberCoursePreference;
	}

	public int getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String toString() {
		return this.memberLastName + ", " + this.memberFirstName + ", " + this.memberEmail + ", " + this.memberAddress
				+ ", " + this.memberCoursePreference + ", " + "+45"+ this.memberPhone;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
			return false;
		Member mem1 = (Member) obj;
		return (memberFirstName.equals(mem1.memberFirstName)) && (memberLastName.equals(mem1.memberLastName));
	}
}
