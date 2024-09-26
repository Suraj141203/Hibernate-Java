 package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestUpdate {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();
		dto.setId(0);
		dto.setFirstName("Vinjal");
		dto.setLastName("Jain");
		dto.setLoginId("Jain1412@gmail.com");
		dto.setPassword("4321");
		dto.setDob(new Date());
		dto.setAddress("Ratlam");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();
	}
}