package com.example.PersistanceAPI.vo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="serviceChar")
public class ServiceCharacteristic{
    public String name;
    public Object value;
}
