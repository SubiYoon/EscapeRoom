package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Swap {
    private int swap_code;
    private int user_code;
    private int theme_code;
    private Date reserved_date;
    private int reserved_time;
    
}
