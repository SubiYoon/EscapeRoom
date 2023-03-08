package room.escape.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Theme {
    private int theme_code;
    private int store_code;
    private int genre_code;
    private int time;
    private String posting;
    private int number_people;
    private int level;
    private String device;
    private String activity;
    
}
