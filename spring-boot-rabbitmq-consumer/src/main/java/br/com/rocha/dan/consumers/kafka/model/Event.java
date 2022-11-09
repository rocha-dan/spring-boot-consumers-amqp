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
public class Event implements Serializable {

	private static final long serialVersionUID = 1L;

	private String version;
	private String name;
	private String payload;

}
