package room.escape.dto;

import java.util.Date;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Qna {
    private int qna_code;
    private int user_code;
    private int store_code;
    private String title;
    private String posting;
    private Date writedate;

}
