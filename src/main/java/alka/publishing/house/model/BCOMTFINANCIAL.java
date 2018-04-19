package alka.publishing.house.model;

import javax.persistence.Entity;

@Entity
public class BCOMTFINANCIAL extends BaseQues{

	public BCOMTFINANCIAL(String ques, String opt1, String opt2, String opt3, String opt4, String correctAns,
			String explanation) {
		super(ques, opt1, opt2, opt3, opt4, correctAns, explanation);
	}

}
