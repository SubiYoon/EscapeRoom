package room.escape.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Wishlist{
    private int wishlist_code;
    private int user_code;
    private int theme_code;
}
