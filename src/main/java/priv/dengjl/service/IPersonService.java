package priv.dengjl.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import priv.dengjl.bean.Person;

@WebService
@Path("/person")
public interface IPersonService {

	@GET
	@Path("/get/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Person queryStudent(@PathParam("id") long id);

	@GET
	@Path("/gets/")
	@Produces({ MediaType.APPLICATION_JSON }) // 可支持多重协议，使用，号隔开
	public List<Person> queryStudentList();
}