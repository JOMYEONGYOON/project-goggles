![mysql](https://img.shields.io/badge/데이터베이스-MySQL8.0_Community_Server-blue) 
![naver nanum font](https://img.shields.io/badge/폰트-네이버_나눔폰트-green)
![java se development kit](https://img.shields.io/badge/자바-1.8-red)

<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/start.gif" width="430" height="250">
</span>
<span>
  <img src="https://github.com/louisevil/goggles/blob/master/resources/image/main.gif" width="430" height="250">
</span>

# 설명
GOGGLES 프로젝트라고 이름을 지어진 이유는 검색엔진을 구현해보고 싶은 기분에, GOGGLE 느낌나게 GOGGLES 지었고, 테마는 미니언즈 캐릭터 들일 고글을 다 쓰고 있어서 미니언즈 배경을 사용하였습니다. 검색엔진을 위해 필요한 사전을 구현하게 되었습니다.검색엔진에서 찾을 때 매칭해야 될 키워드가 필요한데 이 키워드를 저장하기 위한 구조를 어떤것일지 생각해보다가 사전 이라는 형태로 구성하면 괜찮을 것 같아서 시작하게되었습니다.

데이터를 넣을 고민을 하다가 data.go.kr에 용어 사전이 있을 거 같아서 검색을 해봤습니다.data.go.kr 공공데이터 관련 웹사이트입니다. csv, api 형태로 자료를 얻을 수 있고, GOGGLES 프로젝트에서는 csv 파일을 가져와서 mysql community에서 바로 csv를 query로 변환하여 테이블을 생성할 수 있습니다. 저장 후에 데이터베이스를 또 sql로 변환하여 저장하였고, 이것을 데이터베이스 관리하는 쿼리문으로 다시 사용하였습니다.


# 과정
분석, 설계, 환경설정, 구현, 테스트, 마무리 단계별로 진행하였습니다. 처음 일정을 계획할때 분석,설계,구현,테스트 4단계로 정하고 환경설정과 정리 과정을 추가하였습니다. 프로젝트 설계와 개발환경을 설정하는데 프로젝트 전체 일정의 절반을 차지했고 그 다음으로 구현의 비중이 높았습니다. 2월말 부터 코로나 여파로 프로젝트 발표일이 미뤄지면서, 3월 2일 이후부터는 프로젝트 유지보수를 하였고, 정리작업을 조금더 보완하였습니다.

# 일정
| 일             	| 월                      	| 화             	| 수                          	| 목                      	| 금             	| 토            	|
|----------------	|-------------------------	|----------------	|-----------------------------	|-------------------------	|----------------	|---------------	|
|                	|                         	|                	|                             	|                         	|                	| 2020.02.22    	|
|                	|                         	|                	|                             	|                         	|                	| 요구사항 분석 	|
| 2020.02.23     	| 2020.02.24              	| 2020.02.25     	| 2020.02.26                  	| 2020.02.27              	| 2020.02.28     	| 2020.02.29    	|
| 프로젝트 기획  	| 프로젝트 설계           	| 개발 환경 설정 	| 협업 관리 도구Git 환경 설정 	| 데이터베이스관리자 구현 	|  UI사용자 구현 	|  UI검색 구현  	|
| 2020.03.01     	| 2020.03.02              	|                	|                             	|                         	|                	|               	|
| 테스트유지보수 	| 정리문서작성, 주석 작성 	|                	|                             	|                         	|                	|               	|

# 구현
관리페이지에서 데이터베이스에 사전 데이터가 추가 되어있으면, 회원가입을 하면 로그인을 하여 사전 데이터를 검색할 수 있습니다. 주요 기능은 단어 검색과 프로젝트의 데이터베이스 관리를 할 수 있습니다.
| 회원가입                 	| 로그인          	| 검색        	| 관리                      	|
|--------------------------	|-----------------	|-------------	|---------------------------	|
| 아이디 중복확인>회원가입 	| 회원가입>로그인 	| 로그인>검색 	| 데이터베이스 생성 및 삭제 	|

# 프로젝트 관리
소스코드를 관리할 때 .gitignore 파일을 사용하여 필터링 하면 필요한 부분만 업로드 할 수 있습니다. Git에서 프로젝트를 팀원들과 함께 관리를 하다보면 , 그래프를 살펴보면 프로제트가 분리되었다가 합쳐지는 지점 쉽게 발견할 수 있습니다.  이때 같은 소스코드를 동시에 편집 후 업로드를 하게되면 충돌이나는 문제가 발생할 수 있습니다. 

# 협업
깃 허브 프로젝트 레퍼지토리를 잘 살펴보면 Project를 관리 할 수 있는 페이지가 있습니다. PPT와 같은 형태로 프로젝트 작업 내역을 관리 할 수 있습니다. Github Project에서 협업 관리는 F5를 계속 눌러 확인을 해야되는 문제가 있습니다.
| Goggles 	| 설명 	|
|----------------------------------------------------------	|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	|
|   src/    &nbsp;louisevil/   &nbsp;thm121/   &nbsp;power8128/   &nbsp;resources/ 	| src에 공통 소스코드 원본 초기, 설계 코드를  작성하였고, 각각의 소스폴더 공간에서 Test라는 것을 추가하여 복사하였습니다. 그리고 이후에 관리자가 통합하는 형태로 진행하였습니다. 하지만, 실제 이렇게 관리 비중은 적었고 프로젝트 기간이 짧고, Git이라는 프로그램에 아직 익숙하지 않았기 때문에 주로 강의실이 아닌 장소일 경우 네이트온이나 카카오톡으로 작업내역을 확인하고, 소스코드를 공유하여 다시 통합하는 방식으로 부족한 부분을 해결하였습니다. src에서는 통합하는 사람이 아닐 경우 웬만하면 수정하지 않고 작업을 했습니다. 	|

