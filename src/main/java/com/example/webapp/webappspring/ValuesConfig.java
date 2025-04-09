package com.example.webapp.webappspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
    //encoding se especifica la codificacion del texto del .properties especificado (ascentos)
	@PropertySource(value = "classpath:values.properties", encoding = "UTF-8")
})
/**
 * Clase de configuracion que con la anotacion @Configuration se designa como una clase de configuracion
 * (bean) del proyecto Spring
 */
public class ValuesConfig {

}
