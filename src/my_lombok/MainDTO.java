package my_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
//@(어노테이션)
@Setter
@Getter
@ToString
@NoArgsConstructor //mainDTO생성
@AllArgsConstructor //모든 생성자를 받아준다
*/

@Data //위의 어노테이션을 한번에 추가하는 어노테이션
@AllArgsConstructor
//AllArgsConstructor만 사용하면 MainDTO d = new MainDTO();의
//new가 활성되지 않기때문에
@NoArgsConstructor //를 같이 사용해주어야 한다.
public class MainDTO {
	private String name;
	private int age;
	
}
