# Goggles
![mysql](https://img.shields.io/badge/데이터베이스-MySQL8.0_Community_Server-blue) 
![naver nanum font](https://img.shields.io/badge/폰트-네이버_나눔폰트-green)
![java se development kit](https://img.shields.io/badge/자바-1.8-red)

<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/start.gif" width="430" height="250">
</span>
<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/main.gif" width="430" height="250">
</span>

<br>

## 설명
GOGGLES 프로젝트라고 이름을 지어진 이유는 검색엔진을 구현해보고 싶은 기분에, GOGGLE 느낌나게 GOGGLES 지었고, 테마는 미니언즈 캐릭터 들일 고글을 다 쓰고 있어서 미니언즈 배경을 사용하였습니다. 검색엔진을 위해 필요한 사전을 구현하게 되었습니다.검색엔진에서 찾을 때 매칭해야 될 키워드가 필요한데 이 키워드를 저장하기 위한 구조를 어떤것일지 생각해보다가 사전 이라는 형태로 구성하면 괜찮을 것 같아서 시작하게되었습니다.

데이터를 넣을 고민을 하다가 data.go.kr에 용어 사전이 있을 거 같아서 검색을 해봤습니다.data.go.kr 공공데이터 관련 웹사이트입니다. csv, api 형태로 자료를 얻을 수 있고, GOGGLES 프로젝트에서는 csv 파일을 가져와서 mysql community에서 바로 csv를 query로 변환하여 테이블을 생성할 수 있습니다. 저장 후에 데이터베이스를 또 sql로 변환하여 저장하였고, 이것을 데이터베이스 관리하는 쿼리문으로 다시 사용하였습니다.

<br>


