# WeatherForecast

Following the given instructions I purchased an API key from wunderground.com and constructed the JSON’s URL.

Got an overview of JSON's structure with Chrome's Postman.

I created a Maven project in Eclipse JEE Oxygen IDE (Maven 3.3.9).

I added Jackson 2.6.3 data binding dependency into pom.xml.

I converted json to POJO at http://pojo.sodhanalibrary.com/

I added those classes into my project (model package).

Used object mapper to parse JSON content into the objects. 

I got the requested metrics from DailySummary object and export them at a 'Result.txt' file which looks like this:			


  The weather forecast for the date 30/10/2017 in New York is: 

  Max percentage humidity:		93

  Max Temp in C:						 	16

  Min Temp in C:		 					8

  Precipitation in mm:				6.35


 
