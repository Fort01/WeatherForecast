package wf.wtf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Dailysummary;
import model.Model;

/**
 * Weather Forecast of New York in 30/10/2017
 * 
 * By Travlos Nikiforos
 *
 */
public class App {
	public static void main(String[] args) 
	{

		String url = "http://api.wunderground.com/api/445c149f378500cf/history_20171030/q/NY/New_York.json";

		//RestTemplate rest = new RestTemplate();
		//String result = rest.getForObject(url, String.class);
		//System.out.println(result);

		ObjectMapper mapper = new ObjectMapper();
		Model model = new Model();
		
		try {
			model = mapper.readValue(new URL(url), Model.class);

		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Dailysummary myDailySum = model.getHistory().getDailysummary()[0];
		PrintWriter writer = null;

		try {
			writer = new PrintWriter("Result.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		writer.println("The weather forecast for the date 30/10/2017 in New York is: \n");
		writer.println("Max percentage humidity:\t\t" + myDailySum.getMaxhumidity());
		writer.println("\nMax Temp in C:\t\t\t\t\t" + myDailySum.getMaxtempm());
		writer.println("\nMin Temp in C:\t\t\t\t\t" + myDailySum.getMintempm());
		writer.println("\nPrecipitation in mm:\t\t\t" + myDailySum.getPrecipm());

		writer.close();
		
		System.out.println("OK");

	}

}
