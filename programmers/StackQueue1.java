package algori;

import java.util.LinkedList;

class Solution{

public static int solution(int[] priorities, int location) {
	LinkedList<Integer> qu = new LinkedList<Integer>();
	LinkedList<Integer> loc = new LinkedList<Integer>();
	LinkedList<Integer> result = new LinkedList<Integer>();
	for(int i = 0; i<priorities.length;i++) {
		qu.add(priorities[i]);  //2,1,3,2
		loc.add(i); //0,1,2,3
	}
//	System.out.println(qu);  
//	System.out.println(loc);  
	while(qu.size()>1) {
		

	int max=qu.get(0);
	int flag=0;
	for(int i =1; i<qu.size();i++) {  
		if(qu.get(i)>max) {  
			flag=1;   //������ ū���� �ִٸ�! flag=1
		}
	}
	if(flag==1) {  //������ ū���� �����Ƿ� �ڷκ�����
		qu.add(qu.peek());
		loc.add(loc.peek());
		qu.remove();
		loc.remove();
	}
	else {  //������ ū���� �����Ƿ� ����ϱ�
		qu.remove();
		result.add(loc.poll());
	}
	
	}
	//�ϳ� ����
	result.add(qu.poll());
	System.out.println(result);  
	int answer = 1;
	for(int i=0; location !=result.get(i); i++) {
		answer++;
	}
	return answer;
}
}

public class print {

	public static void main(String[] args) {
//		int[] priorities = new int[] { 2, 1, 3, 2 };
//		int location = 2;
		int[] priorities = new int[] { 1, 1, 9, 1, 1, 1};
		int location = 2;
		Solution sol1 = new Solution();
		System.out.println(sol1.solution(priorities, location));
		// return 1�� ���;���
	}

//����
	
}