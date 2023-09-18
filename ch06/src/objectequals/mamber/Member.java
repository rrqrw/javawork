package objectequals.mamber;

public class Member {
	private String memberId;  // 사번 
	private String name;   // 이름
	
	public Member (String memberId , String name) {
		this.memberId =memberId;
		this.name= name;
		
	}
//equals() 재정의
	@Override
	public int hashCode() {// 멤버이름 .hashCode();
		
		return memberId.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;  //Member 형으로 다운캐스팅 
			if(this.memberId.equals(member.memberId)){
				return true;// 외부 입력된 회원아이디와 이미 생성된 회원아이디가 일치하면 
			}
					
		}
		return false;
	}
	@Override // 객체의 문자열정보 toString ()재정의
	public String toString() {
		return memberId + ", " + name;
	}
	

}
