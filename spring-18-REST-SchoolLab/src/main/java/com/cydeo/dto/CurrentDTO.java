
package com.cydeo.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "observation_time",
    "temperature",
    "weather_code",
    "weather_icons",
    "weather_descriptions",
    "wind_speed",
    "wind_degree",
    "wind_dir",
    "pressure",
    "precip",
    "humidity",
    "cloudcover",
    "feelslike",
    "uv_index",
    "visibility",
    "is_day"
})
@Generated("jsonschema2pojo")
public class CurrentDTO {

    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("temperature")
    private Integer temperature;
    @JsonProperty("weather_code")
    private Integer weatherCode;
    @JsonProperty("weather_icons")
    private List<String> weatherIcons = null;
    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions = null;
    @JsonProperty("wind_speed")
    private Integer windSpeed;
    @JsonProperty("wind_degree")
    private Integer windDegree;
    @JsonProperty("wind_dir")
    private String windDir;
    @JsonProperty("pressure")
    private Integer pressure;
    @JsonProperty("precip")
    private Integer precip;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("cloudcover")
    private Integer cloudcover;
    @JsonProperty("feelslike")
    private Integer feelslike;
    @JsonProperty("uv_index")
    private Integer uvIndex;
    @JsonProperty("visibility")
    private Integer visibility;
    @JsonProperty("is_day")
    private String isDay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("observation_time")
    public String getObservationTime() {
        return observationTime;
    }

    @JsonProperty("observation_time")
    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    @JsonProperty("temperature")
    public Integer getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("weather_code")
    public Integer getWeatherCode() {
        return weatherCode;
    }

    @JsonProperty("weather_code")
    public void setWeatherCode(Integer weatherCode) {
        this.weatherCode = weatherCode;
    }

    @JsonProperty("weather_icons")
    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    @JsonProperty("weather_icons")
    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    @JsonProperty("weather_descriptions")
    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    @JsonProperty("weather_descriptions")
    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    @JsonProperty("wind_speed")
    public Integer getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("wind_degree")
    public Integer getWindDegree() {
        return windDegree;
    }

    @JsonProperty("wind_degree")
    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    @JsonProperty("wind_dir")
    public String getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("precip")
    public Integer getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("cloudcover")
    public Integer getCloudcover() {
        return cloudcover;
    }

    @JsonProperty("cloudcover")
    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    @JsonProperty("feelslike")
    public Integer getFeelslike() {
        return feelslike;
    }

    @JsonProperty("feelslike")
    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    @JsonProperty("uv_index")
    public Integer getUvIndex() {
        return uvIndex;
    }

    @JsonProperty("uv_index")
    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    @JsonProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("is_day")
    public String getIsDay() {
        return isDay;
    }

    @JsonProperty("is_day")
    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
