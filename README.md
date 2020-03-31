![version](https://img.shields.io/badge/버젼-1.0-beta-yellow)_<br>
![mysql](https://img.shields.io/badge/DB-MySQL8.0_Community_Server-blue) <br>
![naver nanum font](https://img.shields.io/badge/폰트-네이버_나눔폰트-green) <br>
![java se development kit](https://img.shields.io/badge/자바-1.8-red) <br>
![docs](https://img.shields.io/badge/문서-32lab.github.io/goggles-orange) <br>

<p>
GOGGLES 프로젝트라고 이름을 지어진 이유는 GOGGLE과 똑같이 검색엔진을 만들면 어떨까 해서 GOGGLE 느낌나게 GOGGLES 지었고, 테마는 미니언즈 캐릭터 들일 고글을 다 쓰고 있어서 미니언즈 배경을 사용하였습니다. 사전을 구현한 이유는 검색엔진을 구현하려면 검색엔진에서 찾을 때 매칭해야 될 키워드가 필요한데 이 키워드를 저장하기 위한 구조를 어떤것일지 생각해보다가 사전 이라는 형태로 구성하면 괜찮을 것 같아서 시작하게되었습니다. 현재 개발언어는 자바이지만, 파이썬 같은 경우에는 dictionary 자료형이 아예 존재하더군요..이때 사전에 데이터를 넣을 고민을 하다가 data.go.kr에 용어 사전이 있을 거 같아서 검색을 해봤습니다.data.go.kr 공공데이터 관련 웹사이트입니다. csv, api 형태로 자료를 얻을 수 있고, GOGGLES 프로젝트에서는 csv 파일을 가져와서 mysql community에서 바로 csv를 query로 변환하여 테이블을 생성할 수 있습니다. 저장 후에 데이터베이스를 또 sql로 변환하여 저장하였고, 이것을 데이터베이스 관리하는 쿼리문으로 다시 사용하였습니다.
</p>

### 라이브러리
#### Lorem Ipsum
무작위 단어, 문장을 생성하여 글 컨텐츠를 의미없는 텍스트로 생성해주는 라이브러리입니다
```Java
LoremIpsum loremIpSum = new LoremIpsum();
loremIpSum.getEmail();
```
```
lorie.townsend@example.com
stacey.olsen@example.com
andrea.mcfarland@example.com
shaun.trevino@example.com
kurt.ray@example.com
louise.ramirez@example.com
```

### 상수
```
public static final int PADDING = 12;
public static final int FRAME_WIDTH = 1280;
public static final int FRAME_HEIGHT = 720;
public static final String DATABASE = "database";
```

### GUI
##### rgba 색상
```Java
Color color = new Color(1.0F, 1.0F, 1.0F, 0.0F);
setBackground(color);
```

##### 움직이는 컴포넌트
```Java
JLabel label = new JLabel(“움직이는 레이블”);
label.setLocation(x,y);
```

