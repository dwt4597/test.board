package my.board.model;


public class MemoVO {

	private long id;
	private String m_subject;
	private String m_memo;
	
	public MemoVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemoVO(long id, String m_subject, String m_memo) {
		super();
		this.id = id;
		this.m_subject = m_subject;
		this.m_memo = m_memo;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getM_subject() {
		return m_subject;
	}
	public void setM_subject(String m_subject) {
		this.m_subject = m_subject;
	}
	public String getM_memo() {
		return m_memo;
	}
	public void setM_memo(String m_memo) {
		this.m_memo = m_memo;
	}
	
	@Override
	public String toString() {
		return "MemoVO [id=" + id + ", m_subject=" + m_subject + ", m_memo="
				+ m_memo + "]";
	}
	
	
	
}
