package com.butraining.travelcompany.weather;



import java.time.LocalDate;
import org.springframework.data.annotation.CreatedDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;



@Entity
public class Weather {
    
    @Id
    @GeneratedValue
    private long id;



   @CreatedDate
    private LocalDate date;



   private double lat;



   private double lon;



   private String city;



   private String state;



   private double temperature;



   
    public Weather()
    {
        
    }
    



   public Weather(long id, LocalDate date, double lat, double lon, String city, String state, double temperature) {
        super();
        this.id = id;
        this.date = date;
        this.lat = lat;
        this.lon = lon;
        this.city = city;
        this.state = state;
        this.temperature = temperature;
    }
  
    



   public long getId() {
        return id;
    }



   public void setId(long id)
    {
        this.id=id;
    }



   public LocalDate getDate() {
        return date;
    }




    public double getLat() {
        return lat;
    }




    public double getLon() {
        return lon;
    }




    public String getCity() {
        return city;
    }




    public String getState() {
        return state;
    }




    public double getTemperature() {
        return temperature;
    }



   
    





   @Override
    public String toString() {
        return "Weather [id=" + id + ", date=" + date + ", lat=" + lat + ", lon=" + lon + ", city=" + city + ", state="
                + state + ", temperature=" + temperature + "]";
    }
      
}