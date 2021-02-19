<img width="400" alt="logo" align="center" src="https://user-images.githubusercontent.com/67853050/108499597-e20b2c80-72f1-11eb-80b0-4e668cb6bdfb.png">


## 📑 프로젝트 소개

REBORN은 유기 동물에 대한 관심을 재고시키기 위해 동물들의 이름을 지어주는 웹사이트입니다.

‼ <i>본 프로젝트는 풀스택 개발과정 수업의 복습을 위해 Spring boot 기반으로 개발되었습니다.</i> ‼

[![2021 02 15 15 45 26 mp4_20210215_162759 349](https://user-images.githubusercontent.com/74892930/107917181-d85c8e80-6faa-11eb-8817-a472245cdfe0.jpg)](https://user-images.githubusercontent.com/74892930/107915267-8a925700-6fa7-11eb-856a-1bb3c162a796.mp4)

> NOTE: 이미지를 클릭하면 Demo 영상 재생 됩니다😊


## 📆 기간 

 - 2021.01.11 ~ 2021.02.15 (1M)


## 🛠 사용 기술 

### 1. Back-end

  - Java, Spring Boot, Maven, MyBatis

### 2. Front-end

  - HTML/CSS, Java Script(es6), React.js, Three.js, JQuery

### 3. Library
 
  - 공공 데이터 API, 카카오 API, coolsms, mail SMTP, fetch API, three.js

 ### 4. DBMS

  - MySQL


## ⚙ 개발환경

 ### 1. IDE

  - Spring Boot suite, VsCode

 ### 2. 형상 관리 툴

  - Git

 ### 3. 기획, 설계, 일정관리
 
  - google presentation, ER-win, Trello



## 🎞 주요기능

> NOTE: 이미지를 클릭하면 Demo 영상 재생 됩니다😊


### 1. 유기동물

  ✅ OPEN API를 기반으로 유기동물 정보를 제공합니다. 
  
  ✅ 조건 필터를 통해 유기동물 목록 조회가 가능하며, 상세 조회 시 동물 정보 및 발견 위치/보호 위치를 카카오 MAP으로 전시합니다. 
  
  ✅ 또한 카카오 공유 기능을 통해 유기동물 정보를 지인들에게 공유 할 수 있습니다.

<a href="https://user-images.githubusercontent.com/67853050/107921833-730c9b80-6fb2-11eb-9db6-c8d029c06c25.mp4"><img src="https://user-images.githubusercontent.com/67853050/108501040-06680880-72f4-11eb-8d35-b83078f42930.jpg" width="750px" height="350px" alt="클릭 시 유기동물 목록 데모 영상이 재생 됩니다"/></a>

<br>

  ✅ 유기동물들에게 이름을 지어주고, 투표를 통해 동물에게 가장 어울리는 이름을 선정 합니다. 
  
  ✅ 투표는 Spring Scheduler를 통해 이름 모집일자, 투표 기간을 판단하여 투표 상태를 실시간으로 업데이트 합니다.

<a href="https://user-images.githubusercontent.com/67853050/108488174-6bffc900-72e3-11eb-866f-eab5cda8ab0c.mp4"><img src="https://user-images.githubusercontent.com/67853050/108490493-242e7100-72e6-11eb-9ccb-55bbbc22e6e5.jpg" width="750px" height="350px" alt="클릭 시 이름 지어주기 데모 영상이 재생 됩니다"/></a>

<br>
<br>

### 2. 보호소

  ✅ OPEN API를 기반으로 동물 보호소 정보를 제공합니다.
  
  ✅ 보호소 검색 시 관련 검색어 전시, 검색어 자동완성 등의 기능을 통해 편리한 보호소 검색이 가능합니다.
  
  <a href="https://user-images.githubusercontent.com/74892930/107915269-8c5c1a80-6fa7-11eb-8d6f-ba56724806fb.mp4"><img src="https://user-images.githubusercontent.com/74892930/107915352-ab5aac80-6fa7-11eb-9356-b9b81396480e.jpg" width="750px" height="350px" alt="클릭 시 보호소 검색 데모가 재생 됩니다"/></a>
 
 <br>

  ✅ 보호소 정보와 함께 보호 중인 동물 목록을 전시하고, 평가 및 리뷰를 등록 할 수 있습니다. 

  <a href="https://user-images.githubusercontent.com/74892930/107915271-8cf4b100-6fa7-11eb-81fe-75c949e986f5.mp4"><img src="https://user-images.githubusercontent.com/74892930/107915353-ab5aac80-6fa7-11eb-9203-f41559210c68.jpg" width="750px" height="350px" alt="클릭 시 보호소 평가 데모가 재생 됩니다"/></a>
 
<br>
<br>

### 3. 커뮤니티

  ✅ 회원 간 정보 교류 및 소통을 위한 커뮤니티(게시판) 기능을 제공합니다.
  
  ✅ 게시글 작성을 위한 등록/수정/삭제/좋아요 기능과 댓글 작성/수정/삭제 기능을 통해 회원간 정보를 자유롭게 주고 받을 수 있습니다.
  
  ✅ 또한, [실종 신고 게시판]의 경우 실종 된 동물을 찾는 게시판으로 글 등록 시 회원 전체에게 동물을 찾는 알림 메일이 전송 됩니다.
  
  <a href="https://user-images.githubusercontent.com/62827205/107926203-bf5ada00-6fb8-11eb-9b17-f8961da7f91c.mp4"><img src="https://i.esdrop.com/d/b086WqGLyH.png" width="750px" height="400px" alt="클릭 시 커뮤니티 데모가 재생 됩니다"/></a>

<br>
<br>

### 4. 회원

  ✅ Spring Security 기반으로 구현된 로그인, 로그아웃 등의 회원 인증 기능을 제공합니다.
  
  ✅ 아이디 및 비밀번호 찾기 시, 이메일 인증과 휴대전화 인증을 통해 인증을 진행한 후 재설정이 가능합니다.
  
  <a href="https://user-images.githubusercontent.com/73972924/107925596-fda3c980-6fb7-11eb-8045-41c9c438e345.mp4"><img src="https://user-images.githubusercontent.com/73972924/107926036-8cb0e180-6fb8-11eb-8bc4-7be51cdea57b.png" width="750px" height="350px" alt="클릭 시 로그인 데모가 재생 됩니다"/></a>
  
<br>
<br>

### 5. 동물 정보 제공

  ✅ 동물을 기르는데 필요한 유용한 정보들을 제공합니다.
  
  ✅ 관리자가 유용한 정보들을 선별 후 게시하며, 게시 된 정보는 품종 별로 분류되어 전시 됩니다.
  
  <a href="https://user-images.githubusercontent.com/41726750/107925530-e9f86300-6fb7-11eb-902d-c78e93f45955.mp4"><img src="https://user-images.githubusercontent.com/41726750/107926179-b66a0880-6fb8-11eb-8626-f70611e043d1.png" width="750px" height="350px" alt="클릭 시 동물 정보 제공 데모가 재생 됩니다"/></a>
  
<br>
<br>

## 🧑 개발자

- <b>최은희(PM)</b>
    - 아이디어 제공 및 프로젝트 조장 담당
    - 회원 로그인 및 정보 기능 구현
- <b>정혜진(PL)</b>
    - 프로젝트 진도 관리 담당
    - 유기동물 및 이름 지어주기 기능 구현
- <b>김병수(PL)</b>
    - 프로젝트 결함 관리 담당
    - 메인화면 및 보호소 기능 구현
- <b>박현민(PE)</b>
    - 스터디 진행자, 의견 조율 담당
    - 커뮤니티 기능 구현
- <b>황영걸(PE)</b>
    - 프로젝트의 기둥 담당
    - 실종신고 게시판 및 채팅 기능 구현



## 🔗 메인화면 모델 출처
> Easter Island Low Poly : https://sketchfab.com/3d-models/easter-island-low-poly-a3dc85b7cbfd49de95ff21d4ea5b2c7f
> Animals : https://opengameart.org/content/lowpoly-animated-farm-animal-pack
> Smoke - https://redstapler.co/cool-nebula-background-effect-three-js/
