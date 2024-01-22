# 일정 관리

## 기능

+ 전체 일정 조회 기능
+ 특정 일정 조회 기능
+ 일정 등록 기능
+ 일정 수정 기능
    + 비밀번호 필요
+ 일정 삭제 기능
    + 비밀번호 필요

## API 명세서

| Name     | Method | URL                           | Request Param                      | Request Body                                                                                         | Response                                                                                              |
|----------|:------:|-------------------------------|------------------------------------|------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| 전체 일정 조회 |  GET   | /api/schedule                 |                                    |                                                                                                      | {{"id": "id", <br>"title": "title", <br>"description": "description", <br>"user": "user"},<br> {...}} |
| 특정 일정 조회 |  GET   | /api/schedule/{id}            | id: {id}                           |                                                                                                      | {"id": "id", <br>"title": "title", <br>"description": "description", <br>"user": "user"}              |
| 일정 등록    |  POST  | /api/schedule                 |                                    | {"title": "title",<br> "description": "description",<br> "user": "user",<br> "password": "password"} | {"id": "id", <br>"title": "title", <br>"description": "description", <br>"user": "user"}              |
| 일정 수정    |  PUT   | /api/schedule/{id}            | id: {id}                           | {"title": "title",<br> "description": "description",<br> "user": "user",<br> "password": "password"} | {"id": "id", <br>"title": "title", <br>"description": "description", <br>"user": "user"}              |
| 일정 삭제    | DELETE | /api/schedule/{id}/{password} | id: {id},<br> password: {password} |                                                                                                      | {id: {id}}                                                                                            |

## ERD

<img src="resource/entity_ERD.png" alt="ERD" height="512">

## Use Case Diagram

<img src="resource/calendar_useCaseDiagram.drawio.png" alt="UCD" height="512">

