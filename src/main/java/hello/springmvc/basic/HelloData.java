package hello.springmvc.basic;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HelloData {
    @NotNull(message = "널 하지말라고")
    private String username;
    @NotNull
    private Integer age;
}
