package room.escape.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Payment{
    private int payment_code;
    private int reservation_code;
}
