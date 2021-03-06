package Project2MiddleWare;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.dao.JobDao;
import com.niit.dao.UserDao;
import com.niit.model.ErrorClazz;
import com.niit.model.Job;
import com.niit.model.User;

@Controller
public class JobController
{
	@Autowired
	private UserDao userDao;
	@Autowired
	private JobDao jobDao;
	
	@RequestMapping(value="/savejob",method=RequestMethod.POST)
	public ResponseEntity<?>saveJob(@RequestBody Job job,HttpSession session)
	{
		String username=(String) session.getAttribute("username");
		
		if(username==null)
		{
			ErrorClazz error = new ErrorClazz(5,"Unauthorized access");
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.UNAUTHORIZED);
		}
		User user = userDao.getUserByUsername(username);
		if(!user.getRole().equals("ADMIN"))
		{
			ErrorClazz error= new ErrorClazz(6,"Access Denied");
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.UNAUTHORIZED);
		}
		try
		{
			jobDao.saveJob(job);
		}
		catch(Exception e)
		{
			ErrorClazz error=new ErrorClazz(7,"Unable to insert job details " +e.getMessage());
			return new ResponseEntity<ErrorClazz>(error,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Job>(job,HttpStatus.OK);
		
	}
}
