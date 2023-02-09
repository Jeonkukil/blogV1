package shop.mtcoding.shaak.dto.board;

import lombok.Getter;
import lombok.Setter;

public class BoardRe {

    
    @Getter
    @Setter
    public static class BoardSaveReqDto{
        private String title;
        private String content;
    }
}
