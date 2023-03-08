package room.escape.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

public class User {
    private int user_code;
    private String id;
    private String upassword;
    private String email;
    private String phone;
    private String address;
    private String ban;
    private Date birthday;
    private int favorit_genre1;
    private int favorit_genre2;
    private int favorit_genre3;
    private Date writedate;
}
