package  org.vmgs.appempresarial.repositorios;
 
import org.vmgs.appempresarial.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;  
 
@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
		//QueryDslPredicateExecutor<Contact> {
 
	//Contact findByContactFirstname(String firstname);
	/*List<Contact> findByLastnameIgnoreCase(String lastName);
	
	Contact findByEmail(String Email);
	
	@Query("select u from Contact u where u.firstname like %?1")
	List<Contact> buscarPorPrimerNombreEndLike(String name);*/
	//List<Producto> findAll();
}