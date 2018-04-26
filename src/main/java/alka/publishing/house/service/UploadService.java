package alka.publishing.house.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sap.icd.bs.bcm.generated.dto.QuestionDto;
import com.sap.icd.bs.bcm.generated.dto.QuestionList;

import alka.publishing.house.repo.BCOMFFINANCIALrepo;
import alka.publishing.house.repo.BCOMSFINANCIALrepo;
import alka.publishing.house.repo.BCOMTFINANCIALrepo;
import alka.publishing.house.repo.BaseRepo;
import alka.publishing.house.util.BeanConvertor;

@Service
public class UploadService {

	BaseRepo baseRepo;
	@Autowired
	BeanConvertor beanConvertor;
	@Autowired
	BCOMFFINANCIALrepo BCOMFFINANCIALrepo;
	@Autowired
	BCOMSFINANCIALrepo BCOMSFINANCIALrepo;
	@Autowired
	BCOMTFINANCIALrepo BCOMTFINANCIALrepo;
	String className;

	public QuestionList getFiveQues(String stream, String year, String subject) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuestionDto getQuestion(String stream, String year, String subject, String id) {
		initializeRepo(stream.toUpperCase(), year.toUpperCase(), subject.toUpperCase());
		Object obj = beanConvertor.convert(QuestionDto.class, baseRepo.findOne(id),
				"id:ques:opt1:opt2:opt3:opt4:correctAns:explanation:stream:year:subject");
		return (QuestionDto) (obj);
		// return copyObject(BCOMFFINANCIALrepo.findOne(id));
	}

	private QuestionDto copyObject(Object src) {
		QuestionDto dest = new QuestionDto();
		for (Field field : src.getClass().getFields()) {
			try {
				dest.getClass().getField(field.getName()).set(dest, field.get(src));
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return dest;
	}

	public QuestionDto update(QuestionDto body) {
		initializeRepo(body.getStream().toUpperCase(), body.getYear().toUpperCase(), body.getSubject().toUpperCase());
		baseRepo.delete(String.valueOf(body.getQues().hashCode()));
		className = "alka.publishing.house.model." + initializeRepo(body.getStream().toUpperCase(),
				body.getYear().toUpperCase(), body.getSubject().toUpperCase());
		Object obj = null;
		try {
			obj = Class.forName(className)
					.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class,
							String.class, String.class)
					.newInstance(String.valueOf(body.getQues().hashCode()), body.getQues(), body.getOpt1(),
							body.getOpt2(), body.getOpt3(), body.getOpt4(), body.getCorrectAns(),
							body.getExplanation());
			Object objRet = beanConvertor.convert(QuestionDto.class, baseRepo.save(obj),
					"id:ques:opt1:opt2:opt3:opt4:correctAns:explanation:stream:year:subject");
			return (QuestionDto) objRet;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public QuestionDto upload(QuestionDto body) {

		className = "alka.publishing.house.model." + initializeRepo(body.getStream().toUpperCase(),
				body.getYear().toUpperCase(), body.getSubject().toUpperCase());
		Object obj = null;
		try {
			obj = Class.forName(className)
					.getConstructor(String.class, String.class, String.class, String.class, String.class, String.class,
							String.class, String.class)
					.newInstance(String.valueOf(body.getQues().hashCode()), body.getQues(), body.getOpt1(),
							body.getOpt2(), body.getOpt3(), body.getOpt4(), body.getCorrectAns(),
							body.getExplanation());
			Object objRet = beanConvertor.convert(QuestionDto.class, baseRepo.save(obj),
					"id:ques:opt1:opt2:opt3:opt4:correctAns:explanation:stream:year:subject");
			return (QuestionDto) objRet;
			// QuestionDto qDto = getQDto(body);
			// return qDto;
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	private QuestionDto getQDto(QuestionDto body) {
		QuestionDto qDto = new QuestionDto();
		qDto.setCorrectAns(body.getCorrectAns());
		qDto.setExplanation(body.getExplanation());
		qDto.setStream(body.getStream());
		qDto.setYear(body.getYear());
		qDto.setSubject(body.getSubject());
		qDto.setOpt1(body.getOpt1());
		qDto.setOpt2(body.getOpt2());
		qDto.setOpt3(body.getOpt3());
		qDto.setOpt4(body.getOpt4());
		qDto.setQues(body.getQues());
		qDto.setId(String.valueOf(body.getQues().hashCode()));
		return qDto;
	}

	private String initializeRepo(String stream, String year, String subject) {
		String className = stream + year + subject;
		String repo = className + "repo";

		switch (repo) {
		case "BCOMFFINANCIALrepo":
			baseRepo = BCOMFFINANCIALrepo;
			break;
		case "BCOMSFINANCIALrepo":
			baseRepo = BCOMSFINANCIALrepo;
			break;
		case "BCOMTFINANCIALrepo":
			baseRepo = BCOMTFINANCIALrepo;
			break;
		default:

		}
		return className;

	}

}
