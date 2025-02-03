package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j //롬복 어노테이션, 로그를 자동으로 만들어줌
public class LogTestController {
    //private final Logger log = LoggerFactory.getLogger(getClass());(=slf4j)
    //특정 클래스와 연관이 있는 로그 기록을 설정하고 사용하는 데 사용됩니다.

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        System.out.println("name = " + name); //과거

        log.trace("trace log={}", name);
        log.debug("debug log={}" , name);
        log.info("info log={}" , name);     //비즈니스 정보, 운영체제에서 꼭 봐야할 정보일때 씀
        log.warn("warn log={}" , name);     //경고, 위험할때 씀
        log.error("error log={}" , name);   //에러, 예외가 발생했을때 씀

        return "ok";
    }
}
