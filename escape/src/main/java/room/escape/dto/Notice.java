package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Notice {
    private int notice_code;
    private int store_code;
    private String title;
    private String posting;
    private Date writedate;

}
