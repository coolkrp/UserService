package org.example.userservice.Dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@Getter
@Setter
public class ValidateRequestDto {
    String token;
    Long userId;
}
