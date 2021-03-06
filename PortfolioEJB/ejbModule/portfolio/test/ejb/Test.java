package portfolio.test.ejb;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import portfolio.test.ejb.client.TestLocal;
import portfolio.test.ejb.client.TestRemote;
import portfolio.test.jpa.TestInput;

/**
 * Session Bean implementation class Test
 */
@Stateful
@Local(TestLocal.class)
@Remote(TestRemote.class)
public class Test implements TestRemote, TestLocal {

    @PersistenceContext(unitName ="PortfolioJPA")
    EntityManager em;
    
    /**
     * Default constructor. 
     */
    public Test(){
    	
    }
    

    
    public void ping(String uname)
    {
    	TestInput tobject = new TestInput();
    	tobject.setUname(uname);
    	em.persist(tobject);
    }

}
