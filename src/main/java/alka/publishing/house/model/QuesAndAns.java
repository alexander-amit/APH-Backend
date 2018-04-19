package alka.publishing.house.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class QuesAndAns {

	@Id
	private int id;
	@Lob
	private byte[] data;
	private CustomEnum year;
	private CustomEnum stream;
	private CustomEnum subject;
	private String ques;

	public QuesAndAns(byte[] data, CustomEnum year, CustomEnum stream, CustomEnum subject, String ques) {
		super();
		this.id = ques.hashCode();
		this.data = data;
		this.year = year;
		this.stream = stream;
		this.subject = subject;
		this.ques = ques;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public CustomEnum getYear() {
		return year;
	}

	public void setYear(CustomEnum year) {
		this.year = year;
	}

	public CustomEnum getStream() {
		return stream;
	}

	public void setStream(CustomEnum stream) {
		this.stream = stream;
	}

	public CustomEnum getSubject() {
		return subject;
	}

	public void setSubject(CustomEnum subject) {
		this.subject = subject;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "QuesAndAns [id=" + id + ", year=" + year + ", stream=" + stream + ", subject=" + subject + ", ques="
				+ ques + "]";
	}

}
