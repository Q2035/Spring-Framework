package top.hellooooo.sourcecode.charpter06.config;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Q
 * @Date 03/08/2020 15:45
 * @Description 解析XML文件中的日期
 */
public class DatePropertyEditor extends PropertyEditorSupport {
	private String format = "yyyy-MM-dd";

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(text);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		try {
			Date parse = simpleDateFormat.parse(text);
			this.setValue(parse);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
