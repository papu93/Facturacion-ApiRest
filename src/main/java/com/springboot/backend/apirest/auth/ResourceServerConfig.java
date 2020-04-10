package com.springboot.backend.apirest.auth;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {		
		//Permite implementar reglas de seguridad de cada endpoint, indicando el tipo de metodo.
		
		//Permisos para todos
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/clientes", "/api/clientes/page/**", "/api/uploads/img/**", "/images/**").permitAll() //lista, paginacion y ver img(con o sin)

		/* Configuramos los servicios mediante anotaciones en cada Endpoint 
		//Permisos para USER y ADMIN
		.antMatchers(HttpMethod.GET, "/api/clientes/{id}").hasAnyRole("USER", "ADMIN") //ver un usuario
		.antMatchers(HttpMethod.POST, "/api/clientes/upload").hasAnyRole("USER", "ADMIN") //ver un usuario

		//Permisos solo para ADMIN
		.antMatchers(HttpMethod.POST, "/api/clientes").hasAnyRole("ADMIN") //crear usuario
		.antMatchers("/api/clientes/**").hasRole("ADMIN") //como no indicamos metodo, se aplica a todos (PUT, DELETE)
		*/
		
		.anyRequest().authenticated() //Las demas rutas soolo se puede acceder si estas logueado
		.and().cors().configurationSource(corsConfigurationSource());
	}
	
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        
        //Dominios de las apps clientes
        config.setAllowedOrigins(Arrays.asList("http://localhost:4200", "*"));
        
        // Configurar los metodos que vamos a permitir
        config.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
        config.setAllowCredentials(true);
        config.setAllowedHeaders(Arrays.asList("Content-Type","Authorization"));
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }
    
    @Bean 
    public FilterRegistrationBean<CorsFilter> corsFilter() {
    	//Crea un filtro de Cors donde se la pasa toda la configuracion del metodo anterior
    	FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
    	bean.setOrder(Ordered.HIGHEST_PRECEDENCE); //Asignamos la prioridad mas alta
    	return bean;
    }
}
