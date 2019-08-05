package utils;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.service.*;

public class HibernateUtils {
	private static SessionFactory sf;
	private static Session session;
	static {
		// config
		Configuration cfg = new Configuration().configure();
		// create service reg
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg
				.getProperties()).buildServiceRegistry();
		sf=cfg.buildSessionFactory(reg);
		System.out.println("sf created....");
	}
	public static SessionFactory getSf() {
		return sf;
	}
	public static Session getSession() {
		return sf.getCurrentSession();
	}
	

}
