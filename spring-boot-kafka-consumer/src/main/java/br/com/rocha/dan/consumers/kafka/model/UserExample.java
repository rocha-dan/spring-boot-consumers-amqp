package br.com.rocha.dan.consumers.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserExample implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String document;
	private String birthDate;

}
