package org.vmgs.appempresarial.serviciosBD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import java.util.List;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.io.FileOutputStream;
import org.vmgs.appempresarial.entidades.Producto;
import org.vmgs.appempresarial.repositorios.ProductoRepositorio;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring-beans-test.xml", "classpath:/applicationContext-servlet-test.xml" })
public class TestServicioProducto {

	@Autowired
	private ProductoRepositorio productoRepo;
	/*
	@Autowired
	private UnidadMedidaDao uMedidaDao;
	
	//private static final Logger LOGGER = Logger.getLogger(TestServicioProducto.class);
	private Producto prod;
	private List<Producto> prodList;
	private UnidadMedida unidadm;
	private List<UnidadMedida> uMedList;
	
	@Before
	public void setUp() {
		//PropertyConfigurator.configure("classpath:/log4j.properties");
		System.out.println("@Before - setUp");
		prod = new Producto();
		prodList = new ArrayList<Producto>();
		unidadm= new UnidadMedida();
		uMedList = new ArrayList<UnidadMedida>();
	}
	
	@Test
	public void AgregarProductoTest(){
		String usuario = "admin";
		unidadm.setNombre("libras");
		unidadm.setNombreCorto("lbs");
		unidadm.setFechacrea(new Date());
		unidadm.setUsuariocrea(usuario);
		UnidadMedida t = uMedidaDao.create(unidadm);
		Assert.assertEquals(unidadm.getNombre(), t.getNombre());
		//ahora agregamos varios productos
		prod = pServicio.CrearProducto("Producto 1", unidadm, usuario );
		Assert.assertEquals("Producto 1", prod.getNombre());
		prod = pServicio.CrearProducto("Producto 2", unidadm, usuario );
		Assert.assertEquals("Producto 2", prod.getNombre());
		prod = pServicio.CrearProducto("Producto 3", unidadm, usuario );
		Assert.assertEquals("Producto 3", prod.getNombre());
		
		//ahora probamos que ObtenerTodosProductos funcione
		prodList = pServicio.ObtenerTodosProductos();
		Assert.assertEquals(3, prodList.size());
		
		System.out.println("---Productos agregados----");
		for(Producto p : prodList){
			System.out.println(p.getId()+" '" + p.getNombre()+ "' " + p.getFechacrea());
		}
		
		
	}
	*/
	
	@Test
	public void TestFindAll(){
		if(productoRepo != null){
			System.out.println("productoRepo is OK");
			List<Producto> productList = productoRepo.findAll();
			if(productList.size() > 0){
				Assert.assertNotNull(productList);
				System.out.println("Estos fueron los productos encontrados \n");
				for( Producto p : productList){
					System.out.println(p.toString() + "\n");
				}
			}
			else{
				System.out.println("No se encontraron productos \n");
				Producto q = new Producto();
				q.setNombre("test 1");
				q.setPrecio(2000);
				q.setCantbod(1000);
				productoRepo.save(q);
				List<Producto> productList1 = productoRepo.findAll();
				System.out.println("ahora Estos fueron los productos agregados \n");
				for( Producto p : productList1){
					System.out.println(p.toString() + "\n");
				}
				
			}
		}
		else{
			System.out.println("productoRepo is null");
		}
	}
	
	

}