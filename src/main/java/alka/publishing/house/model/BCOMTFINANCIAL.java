package alka.publishing.house.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BCOMTFINANCIAL extends BaseQues{

	@Id
	int id;
	
	public BCOMTFINANCIAL() {
		super();
	}

	public BCOMTFINANCIAL(int id, String ques, String opt1, String opt2, String opt3, String opt4, String correctAns,
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
