*학습내용*

1. 예외 처리
	- 발생 가능한 경우의 수 추출
	- "         " 개발 코드에 처리 로직 적용
	
		
	
	* 특징
	1. 용어
		1. exception (에외)
		- 개발시 처리 가능한 !!!!!!! 경미한 예외
		2. error (에러)
		- 처리 불가능한 심각한 상황
		
	2. 예외
		1. API 에서 이미 다양한 경우의 관련된 예외 클래스들 다수 제공
		2. 사용자가 직접 예외 클래스 개발도 가능
		
		3. 종류
			1. 컴파일 예외
			- 컴파일 시점에 발생
			- 예 : ClassNotFoundException
			- try ~ catch 필수  ( runtimeException 이랑은 무관!!!)
			
			2. 실행 예외
			- 컴파일 정상 단 실행 시점에 발생
			- ArrayIndexOutputOfBoundsException
			- Arithmetic....Exception
			- try ~ catch 옵션
			- *** java.lang.RuntimeException 의 하위 타입들 모두 해당
			
		4. 처리 문법
			1. try~catch
				try { 
					실행해야하는 로직들, 발생 가능한 경우의 수 예외 상황 존재
				 }catch(예외타입 변수 ){
				  해당 예외 차리 블록
			2. printStackTrace()
			- 발생된 예외 상황의 연관된 모듈 로직 히스토리 출력
			- 자바 기반의 시큐어코딩 가이드 약 44가지 정도의 스펙
				: printStackTrace() 		
2. 자바의 자료구조 API
	1. 동적 메모리 제공하는 유현한 크래스들
	2. 데이터를 어떤 구조로 저장 및 활용할 것인가?
	3. 자료 구조 API 로 데이터 관리할 경우 반드시 데이터 객체 타입
	4. 종류
		1. 배열과 흡사 , index 로 데이터 관리
			- List계열 API
			
		2. 중복 데이터 저장시 기존 데이터 자동 삭제
			유일한 데이터 관리에 적합
			index 등으로 관리 불가 즉 저장 순서에 대한 보장 없음
			API로(method)와 로직으로 데이터 하나하나 발췌해야함
			- 주민, 학번, 사번등의 처리 구조
			- set 계열  API
			
		3. 별칭과 데이터를 매핑해서 관리
			- 별칭 = key(name)
			- 데이터 =  value
			- Map 계열 API
			-*** key 중복 불가 (내부적으로 set 구조로 관리)
			

3. API 표기
	-
	1. Object 타입과 동일한 표기
		E - element
		K - key
		V - value
		T - type
	2. cf  : <? extends 상위타입>
		상위 타입을 상속받는 모든 자식으로 타입 제한  
	