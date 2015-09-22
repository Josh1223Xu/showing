package com.joshua.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.joshua.model.Product;
import com.joshua.service.PojoService;



@Component
@Path("/")
public class MyRESTController {
	
	@Autowired
	PojoService service;
	
    @GET
    @Produces("application/json")
    public List<Product> findAllProducts() {
    	System.out.println(" ~ rest service called ~ ");
        return service.findAllProducts();
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Product createProduct(Product product)
    {
    	service.savePojo(product);
    	
    	return product;
    }
    
    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateProduct(Product product)
    {
    	service.updateProduct(product);
    	
    	return Response.ok().entity(product).build();
    }
    
    @DELETE
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response deleteProduct(@PathParam("id") int id)
    {
    	service.deleteProductByID(id);
    	
    	return Response.ok().build();
    }
    
    
   
}