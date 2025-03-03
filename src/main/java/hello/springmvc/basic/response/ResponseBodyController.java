package hello.springmvc.basic.response;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

@Slf4j
@Controller
public class ResponseBodyController {

    @GetMapping("/response-body-string-v1")
    public void responseBodyV1(HttpServletResponse response) throws IOException {
        response.getWriter().write("ok");
        //http 메시지 바디에 직접 ok 응답메시지를 전달
    }

    @GetMapping("/response-body-string-v2")
    public ResponseEntity<String> responseBodyV2() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
        //ResponseEntity 는 HttpEntity 를 상속받아서 HttpEntity 를 사용할 수 있다.
    }

    @GetMapping("/response-body-string-v3")
    @ResponseBody
    public String responseBodyV3() {
        return "ok";
        // @ResponseBody 를 사용하면 HttpEntity 의 body 에 문자를 직접 넣을 수 있다.
    }

    @GetMapping("/response-body-json-v1")
    public ResponseEntity<HelloData> responseBodyJsonV1() {
        HelloData helloData = new HelloData();
        helloData.setUsername("userA");
        helloData.setAge(20);
        return new ResponseEntity<>(helloData, HttpStatus.OK);
        //http 메시지 컨버터를 이용해서 바디에 직접 json 응답메시지를 전달
    }

    @GetMapping("/response-body-json-v2")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public HelloData responseBodyJsonV2() {
        HelloData helloData = new HelloData();
        helloData.setUsername("userA");
        helloData.setAge(20);
        return helloData;
        //ResponseEntity 를 사용하지 않고 @ResponseBody 를 사용하면
        // HttpEntity 의 body 에 문자를 직접 넣을 수 있다.
        // @ResponseStatus(HttpStatus.OK) 을 사용하면 응답코드를 200으로 설정할 수 있다.
    }
}


