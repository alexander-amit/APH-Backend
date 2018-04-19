package alka.publishing.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.icd.bs.bcm.generated.dto.QuestionDto;
import com.sap.icd.bs.bcm.generated.dto.QuestionList;

import alka.publishing.house.model.BCOMFFINANCIAL;
import alka.publishing.house.repo.BCOMFFINANCIALrepo;
import alka.publishing.house.repo.BCOMSFINANCIALrepo;
import alka.publishing.house.repo.BCOMTFINANCIALrepo;
import alka.publishing.house.repo.BaseRepo;
@Service
public class UploadService {

	BaseRepo baserepo;
	@Autowired
	BCOMFFINANCIALrepo BCOMFFINANCIALrepo;
	@Autowired
	BCOMSFINANCIALrepo BCOMSFINANCIALrepo;
	@Autowired
	BCOMTFINANCIALrepo BCOMTFINANCIALrepo;

	public QuestionList getFiveQues(String stream, String year, String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuestionDto getQuestion(String stream, String year, String subject, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuestionDto update(QuestionDto body) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuestionDto upload(QuestionDto body) {
		initializeRepo(body);
		baserepo.save(new BCOMFFINANCIAL(body.getQues(),body.getOpt1(),body.getOpt2(),body.getOpt3(),body.getOpt4(),body.getCorrectAns(),body.getExplanation()));
		return null;
	}

	private void initializeRepo(QuestionDto body) {
		String stream = body.getStream().toUpperCase();
		String year = body.getYear().toUpperCase();
		String subject = body.getSubject().toUpperCase();
		String repo = stream+year+subject+"repo";

		switch (repo) {
		case "BCOMFFINANCIALrepo":
			baserepo = BCOMFFINANCIALrepo;
			break;
		case "BCOMSFINANCIALrepo":
			baserepo = BCOMSFINANCIALrepo;
			break;
		case "BCOMTFINANCIALrepo":
			baserepo = BCOMTFINANCIALrepo;
			break;
		default:
			
		}

	}

}
