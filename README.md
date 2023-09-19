# 스프링부트 - 카프카 샘플 프로젝트
> 카프카 컨슈머-프로듀서 테스트를 위한 샘플 프로젝트입니다.

# 목차
- [목차](#목차)
    - [1. 카프카 설치 및 샘플 코드 가이드](#1-카프카-설치-및-샘플-코드-가이드)
    - [2. 카프카 컨슈머 테스트 절차](#2-카프카-컨슈머-테스트-절차)

## 1. 카프카 설치 및 샘플 코드 가이드
* [Spring Boot Kafka Consumer Example](https://www.geeksforgeeks.org/spring-boot-kafka-consumer-example/)
* 카프카 설치 및 프로젝트 구성, 코드까지만 참고하고 토픽 생성 및 테스트는 아래 절차에 따라 진행했습니다.

## 2. 카프카 컨슈머 테스트 절차
* [테스트 절차 참고 가이드](https://yooloo.tistory.com/68)
1. 토픽 생성
    * 토픽을 카프카에 생성합니다. 파티션, 브로커 등 설정을 추가할 수 있습니다.
      ```shell
      bin/kafka-topics.sh --create --topic ecoTopic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
      Created topic ecoTopic
      ```
2. 토픽 조회
    * 생성된 토픽을 상세 조회합니다.
      ```shell
      bin/kafka-topics.sh --describe --topic ecoTopic --bootstrap-server localhost:9092
      ```
3. 토픽에 메시지 보내기 -> Produce
    * 토픽에 메시지를 생성합니다. 아래 커멘드로 메시지 생성 프롬프트를 사용할 수 있습니다.
      ```shell
      bin/kafka-console-producer.sh --broker-list localhost:9092 --topic ecoTopic
      ```
4. 토픽 삭제
    * 생성된 토픽을 카프카에서 삭제합니다. 최근 버전부터 카프카 정지없이 토픽을 삭제할 수 있게 되었습니다.
      ```shell
      bin/kafka-topics.sh --delete --topic ecoTopic --bootstrap-server localhost:9092
      ```