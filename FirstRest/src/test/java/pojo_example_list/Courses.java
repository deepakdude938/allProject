package pojo_example_list;

import java.util.List;

public class Courses {
	
	private List<CourseDetails>webautomation;
	
	private List<CourseDetails>api;
	
	private List<CourseDetails>mobileautomation;
	
	public List<CourseDetails> getWebautomation() {
		return webautomation;
	}
	public void setWebautomation(List<CourseDetails> webautomation) {
		this.webautomation = webautomation;
	}
	public List<CourseDetails> getApi() {
		return api;
	}
	public void setApi(List<CourseDetails> api) {
		this.api = api;
	}
	public List<CourseDetails> getMobileautomation() {
		return mobileautomation;
	}
	public void setMobileautomation(List<CourseDetails> mobileautomation) {
		this.mobileautomation = mobileautomation;
	}
}