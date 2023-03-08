package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Review {
    private int reviewe_code;
    private int user_code;
    private int theme_code;
    private String title;
    private String posting;
    private int interior;
    private int story;
    private int level;
    private Date playdate;
    private int success;
    private int hintcount;
    private int cleartime;
    private Date writedate;
    
}
