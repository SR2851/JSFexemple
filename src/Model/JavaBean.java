package Model;

import javax.faces.bean.ManagedBean;

@ManagedBean (name="objet")//pour dire que la classe est gérée par le controlleur
public class JavaBean {
	private String message="Bonjour JSF";
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
}
