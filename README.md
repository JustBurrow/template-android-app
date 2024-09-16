# Android 애플리케이션 템플릿

Android 애플리케이션 개발을 위한 템플릿 레포지토리.

## 개발 환경 설정

## Module Graph

```mermaid
%%{
  init: {
    'theme': 'neutral'
  }
}%%

graph TB
  :ui --> :viewmodel
  :model --> :domain
  :app --> :model
  :app --> :ui
  :viewmodel --> :ui-state
  :viewmodel --> :model

classDef android-library fill:#3BD482,stroke:#fff,stroke-width:2px,color:#fff;
classDef android-application fill:#2C4162,stroke:#fff,stroke-width:2px,color:#fff;
class :ui android-library
class :viewmodel android-library
class :model android-library
class :domain android-library
class :app android-application
class :ui-state android-library

```
## 문서

- [Architecture Decision Records](doc/adr/README.md)

## 참고

- https://github.com/iurysza/module-graph
- [.ignore](https://plugins.jetbrains.com/plugin/7495--ignore)