package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Comment {
    private int comment_code;
    private int comment_code2;
    private int user_code;
    private int wanted_code;
    private String comment;
    private Date writedate;

}
