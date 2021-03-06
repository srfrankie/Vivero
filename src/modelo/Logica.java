package modelo;

import controlador.Coordinador;

public class Logica {
	//Atributos
	private Coordinador miCoordinador;
	private ArticuloDao articuloDao=new ArticuloDao();
	
	public void setCoordinador(Coordinador coordinador){
		miCoordinador=coordinador;
	}
	//si existe en base de datos.
	public boolean validarArticulo(Articulo art){
		return articuloDao.guardarArticulo(art);
	}
	public boolean validarCategoria(String text) {
		//Consultar si categoria existe da true si existe la cat
		return (articuloDao.consultarSiCategoriaExiste(text));
	}	
	public void guardarCategoria(String nombre){
		articuloDao.guardarCategoria(nombre);
	}
	public void actualizarCategoria(String viejo, String nuevo) {
		articuloDao.actualizarCategoria(viejo, nuevo);
	}
	public void borrarCategoria(String valueAt) {
		articuloDao.borrarCategoria(valueAt);
	}
	public void borrarArticulo(String valueAt) {
		articuloDao.borrarArticulo(valueAt);
	}
	public void actualizarArticulo(Articulo art,String nombreViejo) {
		articuloDao.actualizarArticulo(art,nombreViejo,articuloDao.obtenerIdCategoria(art));
	}
	public int obtenerIdArticulo(String nombre) {
		return articuloDao.obtenerIDArticulo(nombre);
	}
	public boolean consultarSiArticuloExiste(String nombre){
		return articuloDao.consultarSiArticuloExiste(nombre);
	}
}