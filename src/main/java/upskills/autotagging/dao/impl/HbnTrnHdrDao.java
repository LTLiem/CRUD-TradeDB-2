package upskills.autotagging.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import upskills.autotagging.dao.TrnHdrDao;
import upskills.autotagging.model.TrnHdr;

public class HbnTrnHdrDao extends AbstractHbnDao<TrnHdr> implements TrnHdrDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<TrnHdr> getDataByFmly(String fmly) {
		List<TrnHdr> result = null;
		Session session = getSession();
		Transaction tx = null;	
		
		try {
			tx = session.beginTransaction();			
			result = (List<TrnHdr>)session
					 .getNamedQuery("getDataByFmly")
					 .setParameter("trnFmly", fmly)					
					 .list();		
		} catch(Exception e) {
			e.printStackTrace();
		}	
		finally {
			session.close();
		}
		return result;	
	}

}
