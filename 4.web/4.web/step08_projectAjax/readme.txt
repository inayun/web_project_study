[1] �ǽ� ����
	1. Servlet API�� Ȱ���� Web Program �����ϱ�
	 
		
[2] �ǽ�  
	1. ���� JDBC ������Ʈ �ҽ� Ȯ���ϱ�
	
	2. �߰� ���� ����
		2-1. Connection Pool ������ ��ȯ�ϱ�
			- context.xml ���� �����Ǿ��� 
		
		2-2. �̸� ������ ����[���� ����]
		  - �������� ��� ��� ������Ʈ ��� ���� �˻��ϱ�
				
		2-3. �����ؾ� �ϴ� ����
			2-3-1. ��� ����� ��� �˻��ϱ�
			2-3-2. ��� ����� ���� �����ϱ�
			2-3-3. ��� ����� Ż���ϱ�
			
		2-4. ���Ŀ� ȥ�� �� ����
			������ CRUD			
		
	3. blank source
		3-1. ProbonoFrontController.java
			3-1-1. activistAll() : ��� ��� ����� �˻��ϱ�
			3-1-2. activistUpdate() : ��� ����� ���� �����ϱ�
			3-1-3. activistDelete() : ��� ����� Ż���ϱ�
		
		3-2. activistList.jsp		
			3-2-1. ��� ��� ����� ���� �ϼ��ϱ�
			
		3-3. probonoProjectList.jsp
			3-3-1. ��� ��� ��� ������Ʈ ����  �ϼ��ϱ�
			
		3-4. activistDetail.jsp
			3-4-1. EL tag�� ��·��� �ϼ��ϱ�	
			
----- �� ���� ������ : �Ӽ���, �����
//JDBC����	
1. sql ����� properties�� �����Ͽ� �����ϱ�.
//�ڹ� ����
2. ActivistDAO �ϼ��ϱ�
	2-1 : addActivist �ϼ��ϱ�
	2-2 : updateActivist �ϼ��ϱ�
	2-3 : deleteActivist �ϼ��ϱ�
//�� �ǽ�
3. ProbonoFrontController �ϼ��ϱ�
	3-1 : activistInsert() �ϼ��ϱ�
	3-2 : activistUpdate() �ϼ��ϱ�
	3-3 : activistDelete() �ϼ��ϱ�
	
	3-4. activistList.jsp		
		3-4-1. ��� ��� ����� ���� �ϼ��ϱ�
			
	3-5. probonoProjectList.jsp
		3-5-1. ��� ��� ��� ������Ʈ ����  �ϼ��ϱ�
			
	3-6. activistDetail.jsp
		3-6-1. EL tag�� ��·��� �ϼ��ϱ�	