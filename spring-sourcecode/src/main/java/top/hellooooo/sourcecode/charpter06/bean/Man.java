package top.hellooooo.sourcecode.charpter06.bean;

import java.util.Date;

/**
 * @Author Q
 * @Date 03/08/2020 15:42
 * @Description
 */
public class Man {
	private Date birth;

	@Override
	public String toString() {
		return "Man{" +
				"birth=" + birth +
				'}';
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
