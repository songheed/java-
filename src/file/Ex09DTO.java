package file;

import java.io.Serializable;

import lombok.Data;

@Data
//public class Ex09DTO {
//	private String name,addr;
//}

public class Ex09DTO implements Serializable {
	private String name,addr;
} //직열화 연결을 해주어야 한다.

