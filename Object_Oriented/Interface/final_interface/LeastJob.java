package ch17;

public class LeastJob implements Scheduler {

	@Override  // 각각에 맞게 오버라이딩한다.
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.");
	}

}
