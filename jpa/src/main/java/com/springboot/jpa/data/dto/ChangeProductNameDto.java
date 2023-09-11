package com.springboot.jpa.data.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChangeProductNameDto {

    private Long number;

    private String name;

}