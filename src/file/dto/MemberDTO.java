package file.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class MemberDTO implements Serializable { //상속받기
	private String id, name;
}
