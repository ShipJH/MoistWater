package com.spring.ml.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class MemberRequestDto {

	private Long id;
	
	@NotBlank(message = "이름을 입력해주세요.")
	private String name;
	
	@NotBlank(message = "전화번호를 입력해주세요.")
	@Email(message = "메일 양식대로 입력해주세요.")
	private String email;
	
    @NotBlank(message = "전화번호를 작성해주세요.")
    @Pattern(regexp = "[0-9]{10,11}", message = "10~11자리의 숫자만 입력가능합니다")
	private String phoneNumber;
	
}
