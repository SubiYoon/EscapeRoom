package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Reservation{
    private int reservation_code;
    private int user_code;
    private int theme_code;
    private Date rdate;
    private int rtime;
    private int price;
    private int rmember;
}
