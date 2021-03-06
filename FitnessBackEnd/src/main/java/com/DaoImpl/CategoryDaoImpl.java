package com.DaoImpl;

import java.util.List;
import com.model.Category;


import javax.transaction.Transactional;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.CategoryDao;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addCategory(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		
		}
		catch(Exception e)
		{
			System.out.println("Exception arise :"+e);
			return false;
		}
	}

	public boolean updateCategory(Category category) 
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception arise :"+e);
			return false;
		}
	}

	public List<Category> retrieveCategory()
	{
		Session session= (Session) sessionFactory.openSession();
		
		return null;
	}

	public Category getCategory(int catId) 
	{
		Session session= (Session) sessionFactory.openSession();
		return null;
	}

	public boolean deleteCategory(Category category)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
	
		}
		catch(Exception e)
		{
			System.out.println("Exception arise :"+e);
			return false;
		}
	}

	
}
