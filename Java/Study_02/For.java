public class For {
	public static void main(String[] args) {
		// for문은 여러번 반복하고 순회할때 사용한다
		// i가 0부터 5미만이 될때까지 i가 1씩 증가하는것을 반복한다
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// 그러나 저런 for문만 있는것이 아니라 조금 향상된 for each가 있다
		// 주로 배열이나 리스트에서 값을 꺼내쓸때 사용한다.
		// []는 배열을 나타낼때 사용한다
		int[] numbers = { 1, 2, 3, 4, 5 };
		// number 라는 새로운 값에 배열의 값을 하나씩 기입한다
		for (int number : numbers) {
			System.out.println(number);
		}
		// for 는 중첩하여 사용할수도 있는데 말그대로 for 안에 for을 더 넣는것이다.
		// 내부의 for이 다 돌아야 외부의 for이 한번 도는 방식이다

		// break 는 탈출 continue 이번만 건너뛰고 다음으로 넘어감
		// break
		for (int i = 0; i < 10; i++) {
			// i가 5가 되면 반복을 멈춘다
			if (i == 5) {
				break;
			}
		}
		// continue
		for (int i = 0; i < 10; i++) {
			// 2는 출력을 안하고 넘어가서 3이 출력됨
			if (i == 2) {
				continue;
			}
		}
	}
}
