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
    private String tname;
    private int themetime;
    private String posting;
    private int number_people;
    private int themelevel;
    private String device;
    private String activity;
    
}
