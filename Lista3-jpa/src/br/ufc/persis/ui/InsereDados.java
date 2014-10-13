package br.ufc.persis.ui;

import br.ufc.persis.dao.DepartamentoDAO;
import br.ufc.persis.dao.DepartamentoJPADAO;
import br.ufc.persis.model.Departamento;






public class InsereDados {
	
	public static void main(String[] args) {
		DepartamentoDAO departamentoNovo = new DepartamentoJPADAO();
		Departamento dep1 = new Departamento();
		dep1.setNome("jose");
		dep1.setNumero(10);
		try{
			departamentoNovo.beginTransaction();
			departamentoNovo.save(dep1);
			departamentoNovo.commit();
		}catch(Exception e){
			departamentoNovo.rollback();
			e.printStackTrace();
		}finally{
			departamentoNovo.close();
		}
		
		
		
		
		/*
		
		UsuarioDAO usuario = new UsuarioJPADAO();
		Usuario u = new Usuario();
		Usuario u2 = new Usuario();
		Usuario u3 = new Usuario();
		Usuario u4 = new Usuario();
		Usuario u5 = new Usuario();
		u.setLogin("Savio Lima");
		u.setSenha("12333");
		u2.setLogin("Jose");
		u2.setSenha("123444");
		u3.setLogin("maria");
		u3.setSenha("12345566677");
		u4.setLogin("Maarculinaa");
		u4.setSenha("marculina123");
		u5.setLogin("Demar");
		u5.setSenha("derma2123");
		try{
			usuario.beginTransaction();
			usuario.save(u);
			usuario.save(u2);
			usuario.save(u3);
			usuario.save(u4);
			usuario.save(u5);
			usuario.commit();
		}catch(Exception e ){
			usuario.rollback();
			e.printStackTrace();
		}finally{
			usuario.close();
		}
		
		/*Usuario u = new Usuario();
		u.setLogin("Eu");
		u.setSenha("123");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("usuarios");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try{
		tx.begin();
		em.persist(u);
		tx.commit();
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			em.close();
		}
		
		
		*/
	}
}
