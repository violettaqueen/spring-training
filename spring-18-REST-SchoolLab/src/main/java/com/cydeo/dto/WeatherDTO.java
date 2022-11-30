
package com.cydeo.dto;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request",
    "location",
    "current"
})
@Generated("jsonschema2pojo")
public class WeatherDTO {

    @JsonProperty("request")
    private RequestDTO request;
    @JsonProperty("location")
    private LocationDTO location;
    @JsonProperty("current")
    private CurrentDTO current;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request")
    public RequestDTO getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(RequestDTO request) {
        this.request = request;
    }

    @JsonProperty("location")
    public LocationDTO getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(LocationDTO location) {
        this.location = location;
    }

    @JsonProperty("current")
    public CurrentDTO getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(CurrentDTO current) {
        this.current = current;
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
