package portfolio.test.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="testhello")
public class TestInput implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestInput(){
		

	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	
	private String uname;
	
	@Column(name ="uname")
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}


}
