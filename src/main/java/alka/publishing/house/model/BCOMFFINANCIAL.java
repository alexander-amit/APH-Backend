package alka.publishing.house.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class BCOMFFINANCIAL {

	@Id
	String id;
	@Column
	String ques;
	@Column
	String opt1;
	@Column
	String opt2;
	@Column
	String opt3;
	@Column
	String opt4;
	@Column
	String correctAns;
	@Column
	String explanation;
	@Column
	String stream;
	@Column
	String year;
	@Column
	String subject;

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getOpt4() {
		return opt4;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public BCOMFFINANCIAL() {
		super();
	}

	public BCOMFFINANCIAL(String id, String ques, String opt1, String opt2, String opt3, String opt4, String correctAns,
			String explanation) {
		super();
		this.id = id;
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.correctAns = correctAns;
		this.explanation = explanation;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
