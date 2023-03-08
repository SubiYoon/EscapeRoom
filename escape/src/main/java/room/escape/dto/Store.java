package room.escape.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Store {
    private int store_code;
    private int admin_code;
    private String sname;
    private String phone;
    private String address;
    private String homepage;

}
