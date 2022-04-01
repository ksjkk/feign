# feign
feign for server to server 통신 / msa 기초


- - -
server1 -> server2</br>
server1에서 server2 resource 가져옴

##
server2 run(8082)</br>
server1 run(8081)

###
server1 에서 server2로 feign call -> interceptor header세팅
- - - 
이하 테스트
