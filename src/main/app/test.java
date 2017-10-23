import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import upskills.autotagging.dao.impl.*;
import upskills.autotagging.model.*;

public class test {

	public static void main(String[] args) {
		System.out.println("--------------begin-------------------");
		
/*		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");	
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session ses = sessionFactory.openSession();
		Transaction tran = null;
		
		
		Issue issue = new Issue();
		issue.setFieldValues("test add new issue 999");
	
		System.out.println(sessionFactory.getCurrentSession().toString());
		System.out.println("Is connected: " + ses.isConnected());
		System.out.println("Is opened: " + ses.isOpen());

	try {
			tran = ses.beginTransaction();			
			//ses.createQuery("select ....")
			ses.save(issue);			
			tran.commit();
		}
		catch(Exception e) {
			tran.rollback();
		}
		finally {
			ses.close();
		}*/
	

/*		Trade trade = new Trade();
		TradeId tradeId = new TradeId("PC", 12351);*/
		
/*		HbnTradeDao hbnTradeDao = new HbnTradeDao();
		

		
		List<Trade> listTrade = hbnTradeDao.getAll();
		
		for(Trade t : listTrade) {
			System.out.println(t.getId().getField());
		}*/
		

		HbnTrnHdrDao hbnTrnHrdDao = new HbnTrnHdrDao();		

		List<TrnHdr> trnHdrs = hbnTrnHrdDao.getDataByFmly("CURR");
		
		for(TrnHdr t : trnHdrs) {
			System.out.println(t.getTrnFmly() + " " + t.getTrnGrp() + " " + t.getTrnType());
		}

		System.out.println("--------------end-------------------");

	}
}
