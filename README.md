# Goggles
![mysql](https://img.shields.io/badge/mysql-8.0.19-blue) 
![naver nanum font](https://img.shields.io/badge/font-naver_nanum_font-green)
![java se development kit](https://img.shields.io/badge/java-1.8-red)
![license](https://img.shields.io/badge/license-MIT-blue)

<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/start.gif" width="430" height="250">
</span>
<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/main.gif" width="430" height="250">
</span>


  GOGGLES 프로젝트라고 이름을 지어진 이유는 검색엔진을 구현해보고 싶은 기분에, GOGGLE 느낌나게 GOGGLES 지었고, 테마는 미니언즈 캐릭터 들일 고글을 다 쓰고 있어서 미니언즈 배경을 사용하였습니다. 검색엔진을 위해 필요한 사전을 구현하게 되었습니다.검색엔진에서 찾을 때 매칭해야 될 키워드가 필요한데 이 키워드를 저장하기 위한 구조를 어떤것일지 생각해보다가 사전 이라는 형태로 구성하면 괜찮을 것 같아서 시작하게되었습니다.
  데이터를 넣을 고민을 하다가 data.go.kr에 용어 사전이 있을 거 같아서 검색을 해봤습니다.data.go.kr 공공데이터 관련 웹사이트입니다. csv, api 형태로 자료를 얻을 수 있고, GOGGLES 프로젝트에서는 csv 파일을 가져와서 mysql community에서 바로 csv를 query로 변환하여 테이블을 생성할 수 있습니다. 저장 후에 데이터베이스를 또 sql로 변환하여 저장하였고, 이것을 데이터베이스 관리하는 쿼리문으로 다시 사용하였습니다.

### 진행과정
  분석, 설계, 환경설정, 구현, 테스트, 마무리 단계별로 진행하였습니다. 처음 일정을 계획할때 분석,설계,구현,테스트 4단계로 정하고 환경설정과 정리 과정을 추가하였습니다. 프로젝트 설계와 개발환경을 설정하는데 프로젝트 전체 일정의 절반을 차지했고 그 다음으로 구현의 비중이 높았습니다. 2월말 부터 코로나 여파로 프로젝트 발표일이 미뤄지면서, 3월 2일 이후부터는 프로젝트 유지보수를 하였고, 정리작업을 조금더 보완하였습니다.
