package service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;

import model.Pais;

public class PaisesServiceWeb  implements PaisesService{
	String dir="D:\\Curso Certificado\\JAVA SE 8\\EJERCICIOS\\Ficheros_datos\\paises.json";
	
	public List<Pais> paisesFromJson(){
		Gson gson=new Gson();
		try(FileReader fr=new FileReader(dir)) {
			Pais[] paises=gson.fromJson(fr, Pais[].class);
			return Arrays.asList(paises);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return List.of(); //lista vacía
		}
	}
	
	public List<String> continentes () {
		return paisesFromJson ().stream() 
				//.map(p -> p.getContinente())
				.map(Pais::getContinente)
				.distinct()
				.toList();
	}
	
	public List<Pais> paisesContinente(String continente) {
		return paisesFromJson()
				.stream()
				.filter(p -> p.getContinente().equals(continente))
				.collect(Collectors.toList());
	}

}
