# rang

게시판 1일차 :게시글 수정 삭제 파일업로드 데이터업로드 까지완료!

게시판 2일차: 멤버로그인추가 회원가입기능 추가
3일차: 
4일차: 

1. 캠프 환경 게시판 /캠프사이트
2. Demo 링크
3. 2024.04.01 & 1명
4. 사용한 기술 (기술 스택)
   mysql
  springboot sts4
  postman
  jQuery
 javascript
 html, css


6. (필요한 경우) ERD

2 
               
8. 핵심 기능 (코드로 보여주거나 코드 링크)
  
10. 트러블슈팅 경험 / 자랑하고 싶은 코드
   제일많았던 이슈 부터 작성
  junit 단위테스트 하면서 발생 이슈:
서비스와 mapper클래스 사이에 뭔가없다는 이슈가 발생했다
찾기위해 코드를 살펴보니 알고보니 mysql데이터에 들어간 데이터에서 이 맞지않아 생긴 문제였다
그래서 mysql에 가서 컬럼명을 고쳐주니 해결되었다 에러코드를 좀더 꼼꼼히살펴볼 필요하다고 느껴져서 내가 코드를 놓치고있는부분이 있었구나 깨닫는 시간이였다
서비스 이슈
원인은 db에 저장된 데이터가없는데 자꾸 mapper에서 호출하고있어서 에러난상황
db에 데이터를 저장해주니 에러가 사라졌다
Error creating bean with name 'postService' defined in file [D:\dev\9_workspace\portfole\bin\main\com\exam\service\PostService.class]: Unsatisfied dependency expressed through constructor parameter 0: No qualifying bean of type 'com.exam.board.domain.PostMapper' available:

12. 회고 / 느낀 점
proFile
name:김세영
HP :010-7404-5033
EMAIL:mter78@naver.com
블로그: https://ptsa.tistory.com
