package alka.publishing.house.util;

import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

@Component
public class BeanConvertor {
	
	public Object convert(final Class<?> target, final Object source, String... fieldPairs) {
		final BeanWrapper trg = new BeanWrapperImpl(target);
		return populateObject(trg, source, fieldPairs);
	}
	
	public Object convert(final Object target, final Object source, String... fieldPairs) {
		final BeanWrapper trg = new BeanWrapperImpl(target);
		return populateObject(trg, source, fieldPairs);
	}

	private Object populateObject(final BeanWrapper trg, final Object source, String... fieldPairs) {
		final BeanWrapper src = new BeanWrapperImpl(source);

		BeanUtils.copyProperties(source, trg.getWrappedInstance());

		Arrays.stream(fieldPairs).forEach(fieldPair -> {
			String[] val = fieldPair.split(":");
			trg.setPropertyValue(val[0], src.getPropertyValue(val[0]));
		});
		return trg.getWrappedInstance();
	}

}
