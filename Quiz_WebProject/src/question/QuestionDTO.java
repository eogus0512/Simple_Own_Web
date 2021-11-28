package question;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionDTO {
	//에러 생겼을 시 에러코드 넣어서 return type맞추기 위한 생성자
	public QuestionDTO(int errorCode) {
		this.questionNumber = errorCode;
	}
	
	//default 생성자
	public QuestionDTO() {
		
	}
	
	int questionNumber = 0;
	//FlagQuestion의 경우에는 Content가 사진 링크임.
	String questionContent = null;
	String example1 = null;
	String example2 = null;
	String example3 = null;
	String example4 = null;
	int answer = 0;
	
	//FlagQuestion의 경우에는 type을 true로 변경해줘야함
	boolean type = false;
	
	public void setFlagQuestion(ResultSet rs) throws SQLException{
		this.questionNumber = rs.getInt(1);
		this.questionContent = rs.getString(2);
		this.example1 = rs.getString(3);
		this.example2 = rs.getString(4);
		this.example3 = rs.getString(5);
		this.example4 = rs.getString(6);
		this.answer = rs.getInt(7);
		this.type = true;
	}
	
	public void setQuestion(ResultSet rs) throws SQLException{
		this.questionNumber = rs.getInt(1);
		this.questionContent = rs.getString(2);
		this.example1 = rs.getString(3);
		this.example2 = rs.getString(4);
		this.example3 = rs.getString(5);
		this.example4 = rs.getString(6);
		this.answer = rs.getInt(7);
	}
}
