package com.pirates.lab.dto.upstream;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Status {
	private int httpCode;
	private String message;
	private String description;
}
