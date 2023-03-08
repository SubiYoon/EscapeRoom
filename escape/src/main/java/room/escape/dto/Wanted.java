package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Wanted {
    private int wantetd_code;
    private int user_code;
    private int theme_code;
    private int comment_code;
    private String title;
    private String posting;
    private Date writedate;
    private Date reserved_date;
    private int reserved_time;

}
