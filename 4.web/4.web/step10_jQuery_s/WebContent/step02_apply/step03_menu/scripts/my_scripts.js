/* 1. html 모든 tag와 하위 text 들은 부모, 자식, 자손과 같은 tree 구조
 * 2. DOM API
 * 	- 문서의 특정 위치의 데이터 또는 구조를 동적으로 변경하는 표준 기술
 * 3. 변수명 권장 명명 규칙
 * 	- $변수명 : html의 일부 구조를 보유하고 재사용하려는 주 목적의 변수명들
 * 
 */

$(document).ready(function(){
 
	var v = false;    
	var $f,  $m , $o;
	
	//remove() 함수는 삭제와 동시에 반환을 합니다 따라서 $f변수는 삭제된 요소를 보유한 변수 차후에 재사용 가능
	$("button#vegOn").click(function(){
 		if (v == false){
 		 	$f = $(".fish").parent().parent().remove();	
			$(".meat").after("<li class='tofu'>두부</li>");
			$m = $(".meat").remove();
			$(".tofu").parent().parent().addClass("veg_leaf");
			v = true;
		}// end if
	});//end veg button


	//??? 메뉴 초기화 구성 함수
	/* 나뭇잎 이미지 제거 및 tofu[두부] 삭제
	*/
	$("button#restoreMe").click(function(){
		
		
		if(v){
			
			$(".menu_entrees li").first().before($f);
			$(".tofu").parent().parent().removeClass("veg_leaf");
			
			$(".tofu").each(function(i){ //매우 사용 빈도가 높음
				$(this).after($m[i]);
			});
			
			$(".tofu").remove();
			v = false;
		}
		
		$(".veg_leaf").removeClass("veg_leaf");
		$(".tofu").remove();
		$(".fish").parent().parent().add(li,$o);
		
	});
});
