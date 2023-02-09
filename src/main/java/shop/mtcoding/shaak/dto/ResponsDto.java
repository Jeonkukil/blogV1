package shop.mtcoding.shaak.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ResponsDto<T> {
    private int code;
    private String msg;
    private T data;
}
