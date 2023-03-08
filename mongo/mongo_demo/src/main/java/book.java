

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class book {
    @Id
    private int id;
    private String name;
}
