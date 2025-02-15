스프링 로그에 대해서 공부했다.

system.out.println 과 log.info 의 차이점은 로그를 통해 필요한 정보를 출력하는 양과 레벨을 설정할수 있는 정도의 차이가 있다
system.out.println은 모든 로그를 다 출력해서 필요한것만 출력할수 없음

log.info, debug는 레벨을 설정을 해서 필요한 로그만 출력해서 콘솔로 볼수가 있다 -- 2025 /02/03


스프링 파라미터 requestParam에 대해서 공부를 했다.
numberformatExcption 원인과 결과를 파악하는것이 중요했다
일반적으로 localhost8080/request-param-v1으로 요청했을때 Cannot parse null string 가 난 이유는 username 과 age값을 넣지 않고 요청을 보냈기 때문에 난 에러
따라서 username 과 age값을 넣어야 에러가 안난다.
