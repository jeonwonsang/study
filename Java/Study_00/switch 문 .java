public class Switch {
	public static void main(String[] args) {
		// 스위치는 선택지중 하나를 선택하는 실행문이며
		// if 문 보다 더 간결하게 할수있습니다
		int num = 0;
		// 여기에서 num(조건식) 은 int / char / string / enum / byte / short도 사용이 가능합니다
		switch (num) {
		case 1:
			break;
		default:
			break;
		}
	}
	// 이렇게 스위치문은 가독성이 좋고 간결하게 조건들을 처리가 가능합니다
	// 매 case 별로 break를 걸지 않으면 아래에 있는 case들도 차례대로 진행됩니다
}
