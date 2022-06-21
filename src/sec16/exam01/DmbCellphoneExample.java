package sec16.exam01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		System.out.println("채널: " + dmbCellphone.channel);
		
		dmbCellphone.poweron();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 오서준인데요");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangup();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
		
		
		
		
		
	}

}
