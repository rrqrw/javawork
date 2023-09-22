package collection.member;

public class Member {
	
	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름 
	 // 생성자
	public Member(int memberId , String memberName) {
		this.memberId =memberId;
		this.memberName= memberName;
		
	}
	// 메서드 (getter//setter)
	public void setMemberId(int memberId) {
		this.memberId = memberId;
		
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
		
	}
	public String gerMemberName() {
		return memberName;
	}
	@Override
	public String toString() {
		return memberId + ":" + memberName;
	}
	@Override
	public int hashCode() {
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(memberId == member.memberId)
				return true;
		}
		
		return false;
	}
	
	
	

}
