package sec01.exam;

public class MemberDto {
	private String mname ;
	private int  mage ;
	private String maddr;
	private String mphone;
	private String memail;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(String mname, int mage, String maddr, String mphone, String memail) {
		super();
		this.mname = mname;
		this.mage = mage;
		this.maddr = maddr;
		this.mphone = mphone;
		this.memail = memail;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMage() {
		return mage;
	}

	public void setMage(int mage) {
		this.mage = mage;
	}

	public String getMaddr() {
		return maddr;
	}

	public void setMaddr(String maddr) {
		this.maddr = maddr;
	}

	public String getMphone() {
		return mphone;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}
	

	
	
}
