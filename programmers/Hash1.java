package algori;

import java.util.Arrays;
import java.util.LinkedList;

public class Hash1 {
	public static void main(String[] args) {
		String[] participant = new String[] { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion = new String[] { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(participant, completion));
	}

	public static String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		LinkedList<String> part = new LinkedList<String>(); // ������ ����Ʈ�� ���
		for (int i = 0; i < participant.length; i++) {
			part.add(participant[i]);
		}
		LinkedList<String> comp = new LinkedList<String>(); // ������ ����Ʈ�� ���
		for (int i = 0; i < completion.length; i++) {
			comp.add(completion[i]);
		}

		// ���ؼ� ����
		while (comp.size() > 0) {
			for (int i = 0; i < part.size(); i++) {
				if (comp.get(0).equals(part.get(i))) {
					comp.remove(0);
					part.remove(i);
					break;
				}
			}
		}
		String answer = part.get(0);
		return answer;
	}
}