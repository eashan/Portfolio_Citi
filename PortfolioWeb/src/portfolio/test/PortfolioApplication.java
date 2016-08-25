package portfolio.test;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class PortfolioApplication extends Application {

private Set<Object> singletons = new HashSet<>();
	
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	
	public PortfolioApplication(){
		singletons.add(new TestResource());
	}
	
	@Override
	public Set<Class<?>> getClasses(){ return empty;}
	
	@Override
	public Set<Object> getSingletons(){ return singletons;}
	
}


